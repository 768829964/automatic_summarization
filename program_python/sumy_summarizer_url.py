import argparse

from sumy.parsers.html import HtmlParser
from sumy.parsers.plaintext import PlaintextParser
from sumy.nlp.tokenizers import Tokenizer
from sumy.nlp.stemmers import Stemmer
from sumy.utils import get_stop_words

from sumy.summarizers.luhn import LuhnSummarizer
from sumy.summarizers.edmundson import EdmundsonSummarizer
from sumy.summarizers.lsa import LsaSummarizer
from sumy.summarizers.lex_rank import LexRankSummarizer
from sumy.summarizers.text_rank import TextRankSummarizer
from sumy.summarizers.sum_basic import SumBasicSummarizer
from sumy.summarizers.kl import KLSummarizer
from sumy.summarizers.reduction import ReductionSummarizer


LANGUAGE = "english"
SENTENCES_COUNT = 5


def main():
    global SENTENCES_COUNT
    parser = argparse.ArgumentParser()
    parser.add_argument("--url", help="Enter a remote url", required=False)
    parser.add_argument("--path", help="Enter a local path", required=False)
    parser.add_argument("--ref", help="Enter path to reference summary", required=False)
    args = parser.parse_args()
    if not args.url and not args.path:
        raise Exception("Enter either the url or the path. See -h for help")

    parser = None

    if args.path:
        parser = PlaintextParser.from_file(args.path, tokenizer=Tokenizer(LANGUAGE))
        SENTENCES_COUNT = int(len(parser.document.sentences)*0.3)
        print(SENTENCES_COUNT)
    elif args.url:
        parser = PlaintextParser.from_url(args.url, tokenizer=Tokenizer(LANGUAGE))
        print("")
    if parser is None:
        raise Exception("Malformed path or url")

    stemmer = Stemmer(LANGUAGE)

    # Luhn Summarizer
    luhn_summarizer = LuhnSummarizer(stemmer)
    luhn_summarizer.stop_words = get_stop_words(LANGUAGE)

    print("Luhn Summarizer")
    f = open("Luhn_summarizer.txt", "w+")
    final_summary = ""
    for sentence in luhn_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    #if args.ref:
        #print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
        #print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))

    print("\n\n")

    # Edmundson Summarizer
    edmundson_summarizer = EdmundsonSummarizer(stemmer)
    edmundson_summarizer.stop_words = get_stop_words(LANGUAGE)
    edmundson_summarizer.bonus_words = [""]
    edmundson_summarizer.stigma_words = [""]
    edmundson_summarizer.null_words = [""]

    print("Edmundson Summarizer")
    f = open("edmundson_summarizer.txt", "w+")
    final_summary = ""
    for sentence in edmundson_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    # if args.ref:
    #     print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
    #     print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))

    print("\n\n")

    # LSA Summarizer
    lsa_summarizer = LsaSummarizer(stemmer)
    lsa_summarizer.stop_words = get_stop_words(LANGUAGE)

    print("LSA Summarizer")
    f = open("lsa_summarizer.txt", "w+")
    final_summary = ""
    for sentence in lsa_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    # if args.ref:
    #     print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
    #     print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))

    print("\n\n")

    # Lex Rank Summarizer
    lex_rank_summarizer = LexRankSummarizer(stemmer)
    lex_rank_summarizer.stop_words = get_stop_words(LANGUAGE)

    print("Lex Rank Summarizer")
    f = open("lex_rank_summarizer.txt", "w+")
    final_summary = ""
    for sentence in lex_rank_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    # if args.ref:
    #     print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
    #     print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))
    print("\n\n")

    # Text Rank Summarizer
    text_rank_summarizer = TextRankSummarizer(stemmer)
    text_rank_summarizer.stop_words = get_stop_words(LANGUAGE)

    print("Text Rank Summarizer")
    f = open("text_rank_summarizer.txt", "w+")
    final_summary = ""
    for sentence in text_rank_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    # if args.ref:
    #     print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
    #     print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))

    print("\n\n")

    # Sum basic Summarizer
    sum_basic_summarizer = SumBasicSummarizer(stemmer)
    sum_basic_summarizer.stop_words = get_stop_words(LANGUAGE)

    print("Sum Basic Summarizer")
    f = open("sum_basic_summarizer.txt", "w+")
    final_summary = ""
    for sentence in sum_basic_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    # if args.ref:
    #     print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
    #     print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))

    print("\n\n")

    # KL Summarizer
    kl_summarizer = KLSummarizer(stemmer)
    kl_summarizer.stop_words = get_stop_words(LANGUAGE)

    print("KL Summarizer")
    f = open("kl_summarizer.txt", "w+")
    final_summary = ""
    for sentence in kl_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    # if args.ref:
    #     print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
    #     print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))

    print("\n\n")

    # Reduction Summarizer
    reduction_summarizer = ReductionSummarizer(stemmer)
    reduction_summarizer.stop_words = get_stop_words(LANGUAGE)

    print("Reduction Summarizer")
    f = open("reduction_summarizer.txt","w+")
    final_summary = ""
    for sentence in reduction_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
    print(final_summary)
    # if args.ref:
    #     print("Rouge 2 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 2))
    #     print("Rouge 3 score: ", summarizer.get_rouge_metric(final_summary, args.ref, 3))

    print("\n\n")


if __name__ == "__main__":
    main()
