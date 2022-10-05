from xml.dom import minidom #导入模块
import os

from sqlalchemy.util import NoneType


def main():
    dirpath = 'D:\\learning_documents\\master_first_year\\thesis\\database\\ecgen-radiology'  # 原来存放xml文件的目录
    newdir = 'D:\\learning_documents\\master_first_year\\thesis\\database\\openi_txt'  # 修改label后形成的txt目录

    if not os.path.exists(newdir):
        os.makedirs(newdir)
    j = 0
    for fp in os.listdir(dirpath):
        print(fp)
        j = j+1
        path = 'D:\\learning_documents\\master_first_year\\thesis\\database\\ecgen-radiology\\'+fp
        dom=minidom.parse(path) #打开xml
        #root = dom.documentElement  # 3.获取dom对象元素
        #print(root.nodeName)
        #print(root.nodeValue)
        #print(root.nodeType)
        #logins = dom.getElementsByTagName("AbstractText")  # 获取节点列表
        #for i in range(len(logins)):  # 获取节点属性
        #    print(logins[i].getAttribute("Label"))
        logins = dom.getElementsByTagName("AbstractText")  # 获取节点列表
        with open(os.path.join(newdir,fp.split('.')[0]+'.txt'),'w+')as f:
            f.write(fp + '\n')
            for i in range(1,len(logins)):
                try:
                    print(logins[i].firstChild.data)
                    f.write(logins[i].firstChild.data+'\n')
                except: continue

if __name__ == "__main__":
    main()





