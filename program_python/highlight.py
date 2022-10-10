import argparse
import os

from sumy.nlp.tokenizers import Tokenizer
from sumy.parsers.plaintext import PlaintextParser


def main(path):
    parser = PlaintextParser.from_file(path, tokenizer=Tokenizer("english"))
    print(path)
    list = ["consolidation","pleural","atelectasis","megaly","edema","media","fracture","lesion","opacity","pheumonia","pneumothorax","pacemaker"]
    f = open(path,"a+")
    sentenceNum = 1
    highlightNum = 1
    for sentence in parser.document.sentences:
        print(sentenceNum)
        sentencestr = str(sentence)
        for word in list:
            if sentencestr.lower().__contains__(word):
                print("yes")
                print(sentencestr)
                f.write("\n")
                f.write("\n")
                f.write("@highlight")
                f.write("\n")
                f.write("\n")
                f.write(sentencestr)
                highlightNum = highlightNum + 1
                break
        if (highlightNum == 5):
            break
        sentenceNum = sentenceNum+1

    f.close()

def path():
    filepath = os.walk("D:\\automatic_summarization2\\automatic_summarization\\mimic-cxr-reports-morethan25-notdied")

    for path, dir_list, file_list in filepath:
        for file_name in file_list:
            print("1"+os.path.join(path, file_name))
            main(os.path.join(path, file_name))

if __name__ == "__main__":
    path()
