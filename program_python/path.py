import csv
import os

def path():

    f = open("D:\\automatic_summarization2\\automatic_summarization\\temporary results\\StudyDateOfEachTest.csv","r")
    reader = csv.reader(f)
    result = {}
    for item in reader:
        if reader.line_num == 1:
            continue
        result[item[0]] = item[1]
    f.close()


    filepath = os.walk("D:\\automatic_summarization2\\automatic_summarization\\mimic-cxr-reports-morethan25-notdied")
    for path,dir_list,file_list in filepath:
        for file_name in file_list:
            g = os.path.join(path,file_name)
            print(g)
            point = file_name[1:9]
            if(result.__contains__(point)):
                print(result[point])
                g1 = os.path.join(path,result[point]+".txt")
                g2 = os.path.join(path,result[point]+"(4).txt")
                print(g1)
                try:
                    os.rename(g,g1)
                except:
                    os.rename(g,g2)
                    continue



if __name__ == "__main__":
    path()