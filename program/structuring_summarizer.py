import os
from xml.dom import minidom

import matplotlib.pyplot as plt
import matplotlib.ticker as ticker
import numpy as np


def main():
    print("please input the name of disease you want to check")
    #disease = input()
    serial = np.zeros([4000])
    present = np.zeros([4000])
    x = np.arange(4)
    j = 0
    dir = 'D:\\learning_documents\\master_first_year\\thesis\\database\\openi_txt'
    csv = 'D:\\learning_documents\\master_first_year\\thesis\\database\\openi_xml'
    disease = "consolidation"
    os.system('D:\\programme_driver\\cTAKES\\cTAKES_HOME\\bin\\runctakesCPE.bat')

    files = os.listdir(dir)
    files.sort(key=lambda x: int(x[:-4]))
    #print(files[0:4])
    for fp in files[0:4]:
        j = j + 1
        i = fp.split('.')[0]
        serial[j] = i
        print(serial[j])
        dirpath = 'D:\\learning_documents\\master_first_year\\thesis\\database\\openi_txt\\' + fp
        csvpath = 'D:\\learning_documents\\master_first_year\\thesis\\database\\openi_xml\\' + fp + '.xml'
        f = open(dirpath)
        buffer = f.read()
        if disease in buffer:
            #dom = minidom.parse(csvpath)
            #diseases = dom.getElementsByTagName("org.apache.ctakes.typesystem.type.textsem.DiseaseDisorderMention")
            present[j] = 1
        print(present[j])
    tick_spacing = 1
    # plt.scatter(x,present[:10],c="red")
    # plt.show()
    x = np.array([1,2,3,4,5,6,7,8,9,10])
    y = np.array([0,1,1,0,0,1,0.5,1,0,0])
    fig, ax = plt.subplots(1, 1)
    #ax.scatter(x, present[:4], c="red")
    ax.scatter(x,y, c="red")

    ax.xaxis.set_major_locator(ticker.MultipleLocator(tick_spacing))
    plt.xlabel('report_num')
    plt.ylabel('severity')
    plt.show()



if __name__ == "__main__":
    main()
