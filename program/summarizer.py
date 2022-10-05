import bs4 as bs
import spacy
#from rouge.rouge import rouge_n_sentence_level

nlp = spacy.load("en_core_web_sm")


#def get_rouge_metric(summary, reference, rouge_level):
#    summary_sentence = summary.split()
#    reference_sentence = open(reference).read().split()
#
#   recall, precision, rouge = rouge_n_sentence_level(summary_sentence, reference_sentence, rouge_level)
#    return rouge


def summarize(html, keywords, entities):
    title = get_html_title(html)
    abstract = get_html_abstract(html)
    body = get_html_text(html)

    nlp.add_pipe(nlp.create_pipe("sentencizer"), first=True)
    doc_title = nlp(title)
    doc_abstract = nlp(abstract)
    doc_body = nlp(body)

    # Extract sentences from title, abstract and body
    sents_title = [sent.string.strip() for sent in doc_title.sents]
    sents_abstract = [sent.string.strip() for sent in doc_abstract.sents]
    sents_body = [sent.string.strip() for sent in doc_body.sents]

    final_summary = ""

    for word in keywords:
        # Check in title
        sent = check_keyword_in_sentences(word, sents_title)
        if sent and sent not in final_summary:
            final_summary += sent
            if not final_summary.strip().endswith("."):
                final_summary += ". "
            continue

        # Check in abstract
        sent = check_keyword_in_sentences(word, sents_abstract)
        if sent and sent not in final_summary:
            final_summary += sent
            if not final_summary.strip().endswith("."):
                final_summary += ". "
            continue

        # Check in body keyword and entity
        sent = check_keyword_in_sentences(word, sents_body, entities)
        if sent and sent not in final_summary:
            final_summary += sent
            if not final_summary.strip().endswith("."):
                final_summary += ". "
            continue

        # Check in body keyword only
        sent = check_keyword_in_sentences(word, sents_body)
        if sent and sent not in final_summary:
            final_summary += sent
            if not final_summary.strip().endswith("."):
                final_summary += ". "
            continue

    return final_summary


def get_html_title(html):
    data = bs.BeautifulSoup(html, "lxml")
    element = data.find("title")

    return element.get_text()


def get_html_abstract(html):
    data = bs.BeautifulSoup(html, "lxml")
    elements = data.find_all(["h1", "h2"])

    abstract = ""

    for el in elements:
        if "abstract" in el.text.lower():
            next_node = el
            while True:
                next_node = next_node.nextSibling
                if next_node is None:
                    break
                if isinstance(next_node, bs.NavigableString):
                    continue
                if isinstance(next_node, bs.Tag):
                    if next_node.name == "h1" or next_node.name == "h2":
                        break
                    abstract += next_node.get_text().strip()
                    abstract += " "

    return abstract


def get_html_text(html):
    return sanitize_html(html)


def check_keyword_in_sentences(keyword, sentences, entities=None):
    for sent in sentences:
        if keyword.lower() in sent.lower():
            if entities is None:
                return sent
            else:
                for ent in entities:
                    if ent.lower() in sent.lower():
                        return sent

    return ""


def sanitize_html(html):
    soup = bs.BeautifulSoup(html, "lxml")
    for s in soup(['script', 'style']):
        s.decompose()
    return ' '.join(soup.stripped_strings)
