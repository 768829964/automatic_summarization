from xml.dom import minidom
import os
import numpy as np
import self as self
from collections import OrderedDict


class confidence_computing:
    def find(self, object, attribute, value):
        for i in range(len(object)):
            attribute = object[i].getAttribute(attribute)
            if (attribute == value):
                return object[i]

    def main(self):
        global sentence_id
        d = OrderedDict()
        d['possible'] = 0.5
        d['probable'] = 0.7
        d['may'] = 0.4
        d['might'] = 0.5
        d['could'] = 0.6



        csvpath = 'C:\\Users\\huawei\\Desktop\\probability'
        txtpath = 'C:\\Users\\huawei\\Desktop\\probability.txt'

        dom = minidom.parse(csvpath)
        f = open(txtpath)
        lines = f.readlines()
        f = open(txtpath)
        buffer = f.read()

        sentence = dom.getElementsByTagName("textspan:Sentence")
        begin_sentence = np.ones((12, 2))
        for i in range(len(sentence)):
            begin_sentence[i, 0] = sentence[i].getAttribute("begin")
            begin_sentence[i, 1] = sentence[i].getAttribute("end")


        diseases = dom.getElementsByTagName("textsem:DiseaseDisorderMention")
        symptom = dom.getElementsByTagName("textsem:SignSymptomMention")
        terminal = dom.getElementsByTagName("syntax:TerminalTreebankNode")
        treebank = dom.getElementsByTagName("syntax:TreebankNode")
        vp = dom.getElementsByTagName("syntax:VP")

        #diseases
        for i in range(len(diseases)):
            uncertainty = diseases[i].getAttribute("uncertainty")
            if uncertainty == "1":
                begin = diseases[i].getAttribute("begin")
                end = diseases[i].getAttribute("end")
                for j in range(len(terminal)):
                    begin_terminal = terminal[j].getAttribute("begin")
                    if begin == begin_terminal:
                        parent = terminal[j].getAttribute("parent")
                        for k in range(len(treebank)):
                            xmi_id = treebank[k].getAttribute("xmi:id")
                            if parent == xmi_id:
                                begin_treebank = int(treebank[k].getAttribute("begin"))
                                end_treebank = int(treebank[k].getAttribute("end"))
                                for x in range(len(begin_sentence)):
                                    if begin_treebank >= begin_sentence[x, 0] and end_treebank <= begin_sentence[x, 1]:
                                        begin_treebank = begin_treebank - x
                                        end_treebank = end_treebank - x
                                        sentence_id = x
                                word = buffer[begin_treebank:end_treebank]
                                for y in range(len(d)):
                                    if list(d.keys())[y] in word:
                                        print(lines[sentence_id],"confidence:",list(d.values())[y])
                                        continue
                for x in range(len(begin_sentence)):
                    if int(begin) >= begin_sentence[x, 0] and int(end) <= begin_sentence[x, 1]:
                        begin_sentence_vp=int(sentence[x].getAttribute("begin"))
                        end_sentence_vp=int(sentence[x].getAttribute("end"))
                        for y in range(len(vp)):
                            begin_vp = int(vp[y].getAttribute("begin"))
                            end_vp = int(vp[y].getAttribute("end"))
                            if begin_vp >= begin_sentence_vp and end_vp <= end_sentence_vp:
                                word = buffer[begin_vp-x:end_vp-x]
                                word = word.split(" ")[0]
                                for z in range(len(d)):
                                    if list(d.keys())[z] in word:
                                        print(lines[x],"confidence:",list(d.values())[z])
                                        continue
            else:
                begin_diseases = diseases[i].getAttribute("begin")
                end_diseases = diseases[i].getAttribute("end")
                for x in range(len(begin_sentence)):
                    if int(begin_diseases) >= begin_sentence[x, 0] and int(end_diseases) <= begin_sentence[x, 1]:
                        print(lines[x],"confidence:", "1")

        ##symptom
        for i in range(len(symptom)):
            uncertainty = symptom[i].getAttribute("uncertainty")
            if uncertainty == "1":
                begin = symptom[i].getAttribute("begin")
                end = symptom[i].getAttribute("end")
                for j in range(len(terminal)):
                    begin_terminal = terminal[j].getAttribute("begin")
                    if begin == begin_terminal:
                        parent = terminal[j].getAttribute("parent")
                        for k in range(len(treebank)):
                            xmi_id = treebank[k].getAttribute("xmi:id")
                            if parent == xmi_id:
                                begin_treebank = int(treebank[k].getAttribute("begin"))
                                end_treebank = int(treebank[k].getAttribute("end"))
                                for x in range(len(begin_sentence)):
                                    if begin_treebank >= begin_sentence[x, 0] and end_treebank <= begin_sentence[x, 1]:
                                        begin_treebank = begin_treebank - x
                                        end_treebank = end_treebank - x
                                        sentence_id = x
                                word = buffer[begin_treebank:end_treebank]
                                for y in range(len(d)):
                                    if list(d.keys())[y] in word:
                                        print(lines[y], "confidence:", list(d.values())[y])
                                        continue
                for x in range(len(begin_sentence)):
                    if int(begin) >= begin_sentence[x, 0] and int(end) <= begin_sentence[x, 1]:
                        begin_sentence_vp=int(sentence[x].getAttribute("begin"))
                        end_sentence_vp=int(sentence[x].getAttribute("end"))
                        for y in range(len(vp)):
                            begin_vp = int(vp[y].getAttribute("begin"))
                            end_vp = int(vp[y].getAttribute("end"))
                            if begin_vp >= begin_sentence_vp and end_vp <= end_sentence_vp:
                                word = buffer[begin_vp-x:end_vp-x]
                                word = word.split(" ")[0]
                                for z in range(len(d)):
                                    if list(d.keys())[z] in word:
                                        print(lines[x],"confidence:",list(d.values())[z])
                                        continue

            #else:
            #    begin_symptom = symptom[i].getAttribute("begin")
            #    end_symptom = symptom[i].getAttribute("end")
            #    for x in range(len(begin_sentence)):
            #       if int(begin_symptom) >= begin_sentence[x, 0] and int(end_symptom) <= begin_sentence[x, 1]:
            #            print(lines[x], "confidence:", "1")



if __name__ == "__main__":
    confidence_computing.main(self)
