from sumy.nlp.stemmers import Stemmer
from sumy.parsers.plaintext import PlaintextParser
from sumy.nlp.tokenizers import Tokenizer
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
stemmer = Stemmer(LANGUAGE)

def read(path):
    parser = PlaintextParser.from_file(path, tokenizer=Tokenizer(LANGUAGE))
    return parser

def Luhn_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Luhn_Summarizer\\'+path+'_Luhn_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\'+path+'.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences)*0.4)
    luhn_summarizer = LuhnSummarizer(stemmer)
    f = open(dir, "w+")
    final_summary = ""
    for sentence in luhn_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
def Edmundson_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Edmundson_Summarizer\\' + path + '_Edmundson_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\' + path + '.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences) * 0.4)
    edmundson_summarizer = EdmundsonSummarizer(stemmer)
    edmundson_summarizer.stop_words = get_stop_words(LANGUAGE)
    edmundson_summarizer.bonus_words = [""]
    edmundson_summarizer.stigma_words = [""]
    edmundson_summarizer.null_words = [""]
    f = open(dir, "w+")
    final_summary = ""
    for sentence in edmundson_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
def Lsa_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Lsa_Summarizer\\' + path + '_Lsa_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\' + path + '.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences) * 0.4)
    lsa_summarizer = LsaSummarizer(stemmer)
    lsa_summarizer.stop_words = get_stop_words(LANGUAGE)
    f = open(dir, "w+")
    final_summary = ""
    for sentence in lsa_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
def Lex_Rank_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Lex_Rank_Summarizer\\' + path + '_Lex_Rank_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\' + path + '.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences) * 0.4)
    lex_rank_summarizer = LexRankSummarizer(stemmer)
    lex_rank_summarizer.stop_words = get_stop_words(LANGUAGE)
    f = open(dir, "w+")
    final_summary = ""
    for sentence in lex_rank_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
def Text_Rank_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Text_Rank_Summarizer\\' + path + '_Text_Rank_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\' + path + '.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences) * 0.4)
    text_rank_summarizer = TextRankSummarizer(stemmer)
    text_rank_summarizer.stop_words = get_stop_words(LANGUAGE)
    f = open(dir, "w+")
    final_summary = ""
    for sentence in text_rank_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
def Sum_Basic_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Sum_Basic_Summarizer\\' + path + '_Sum_Basic_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\' + path + '.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences) * 0.4)
    sum_basic_summarizer = SumBasicSummarizer(stemmer)
    sum_basic_summarizer.stop_words = get_stop_words(LANGUAGE)
    f = open(dir, "w+")
    final_summary = ""
    for sentence in sum_basic_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
def Kl_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Kl_Summarizer\\' + path + '_Kl_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\' + path + '.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences) * 0.4)
    kl_summarizer = KLSummarizer(stemmer)
    kl_summarizer.stop_words = get_stop_words(LANGUAGE)
    f = open(dir, "w+")
    final_summary = ""
    for sentence in kl_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
def Reduction_Summarizer(path):
    dir = 'D:\\thesis\\program\\input\\Reduction_Summarizer\\' + path + '_Reduction_Summarizer.txt'
    path = 'D:\\thesis\\program\\input\\' + path + '.txt'
    parser = read(path)
    SENTENCES_COUNT = int(len(parser.document.sentences) * 0.4)
    reduction_summarizer = ReductionSummarizer(stemmer)
    reduction_summarizer.stop_words = get_stop_words(LANGUAGE)
    f = open(dir, "w+")
    final_summary = ""
    for sentence in reduction_summarizer(parser.document, SENTENCES_COUNT):
        final_summary += str(sentence)
        final_summary += "\n"
    f.write(str(final_summary))
    f.close()
