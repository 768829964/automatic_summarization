import os
from xml.dom import minidom
import numpy as np
import sumy_call
import pytab as pt
import matplotlib.pyplot as plt
import pandas as pd

def Num_Mention(type,dom):
    num = 0
    if(type=='Disease'):
        diseases = dom.getElementsByTagName("org.apache.ctakes.typesystem.type.textsem.DiseaseDisorderMention")
        num = np.array(np.array(diseases).shape)[0]
    if(type=='Symptom'):
        symptoms = dom.getElementsByTagName("org.apache.ctakes.typesystem.type.textsem.SignSymptomMention")
        num = np.array(np.array(symptoms).shape)[0]
    if (type == 'Procedure'):
        procedures = dom.getElementsByTagName("org.apache.ctakes.typesystem.type.textsem.ProcedureMention")
        num = np.array(np.array(procedures).shape)[0]
    if (type == 'Medicine'):
        medicines = dom.getElementsByTagName("org.apache.ctakes.typesystem.type.textsem.MedicationMention")
        num = np.array(np.array(medicines).shape)[0]
    if (type == 'Anatomy'):
        anatomy = dom.getElementsByTagName("org.apache.ctakes.typesystem.type.textsem.AnatomicalSiteMention")
        num = np.array(np.array(anatomy).shape)[0]
    return num
def main():
    #os.system('D:\\programme_driver\\cTAKES\\cTAKES_HOME\\bin\\runctakesCPE.bat')
    dir = 'D:\\thesis\\program\\Output'
    dir_Edmundson_Summarizer = 'D:\\thesis\\program\\Output\\Edmundson_Summarizer'
    dir_Kl_Summarizer = 'D:\\thesis\\program\\Output\\Kl_Summarizer'
    dir_Lex_Rank_Summarizer = 'D:\\thesis\\program\\Output\\Lex_Rank_Summarizer'
    dir_Lsa_Summarizer = 'D:\\thesis\\program\\Output\\Lsa_Summarizer'
    dir_Luhn_Summarizer = 'D:\\thesis\\program\\Output\\Luhn_Summarizer'
    dir_Reduction_Summarizer = 'D:\\thesis\\program\\Output\\Reduction_Summarizer'
    dir_Sum_Basic_Summarizer = 'D:\\thesis\\program\\Output\\Sum_Basic_Summarizer'
    dir_Text_Rank_Summarizer = 'D:\\thesis\\program\\Output\\Text_Rank_Summarizer'
    files = os.listdir(dir)
    D = np.zeros([len(files)-8])
    S = np.zeros([len(files)-8])
    P = np.zeros([len(files)-8])
    M = np.zeros([len(files)-8])
    A = np.zeros([len(files)-8])
    D_Ed = np.zeros([len(files)-8])
    D_Kl = np.zeros([len(files)-8])
    D_Le = np.zeros([len(files)-8])
    D_Ls = np.zeros([len(files)-8])
    D_Lu = np.zeros([len(files)-8])
    D_Re = np.zeros([len(files)-8])
    D_Su = np.zeros([len(files)-8])
    D_Te= np.zeros([len(files)-8])
    S_Ed = np.zeros([len(files)-8])
    S_Kl = np.zeros([len(files)-8])
    S_Le = np.zeros([len(files)-8])
    S_Ls = np.zeros([len(files)-8])
    S_Lu = np.zeros([len(files)-8])
    S_Re = np.zeros([len(files)-8])
    S_Su = np.zeros([len(files)-8])
    S_Te = np.zeros([len(files)-8])
    P_Ed = np.zeros([len(files)-8])
    P_Kl = np.zeros([len(files)-8])
    P_Le = np.zeros([len(files)-8])
    P_Ls = np.zeros([len(files)-8])
    P_Lu = np.zeros([len(files)-8])
    P_Re = np.zeros([len(files)-8])
    P_Su = np.zeros([len(files)-8])
    P_Te = np.zeros([len(files)-8])
    M_Ed = np.zeros([len(files)-8])
    M_Kl = np.zeros([len(files)-8])
    M_Le = np.zeros([len(files)-8])
    M_Ls = np.zeros([len(files)-8])
    M_Lu = np.zeros([len(files)-8])
    M_Re = np.zeros([len(files)-8])
    M_Su = np.zeros([len(files)-8])
    M_Te = np.zeros([len(files)-8])
    A_Ed = np.zeros([len(files)-8])
    A_Kl = np.zeros([len(files)-8])
    A_Le = np.zeros([len(files)-8])
    A_Ls = np.zeros([len(files)-8])
    A_Lu = np.zeros([len(files)-8])
    A_Re = np.zeros([len(files)-8])
    A_Su = np.zeros([len(files)-8])
    A_Te = np.zeros([len(files)-8])
    i = 0
    for fp in files:
        if(len(fp.split('.'))>1):
            dom = minidom.parse(dir+'\\'+fp)
            D[i] = Num_Mention('Disease',dom)
            S[i] = Num_Mention('Symptom',dom)
            P[i] = Num_Mention('Procedure',dom)
            M[i] = Num_Mention('Medicine',dom)
            A[i] = Num_Mention('Anatomy',dom)
            i = i+1
            path = fp.split('.')[0]
            sumy_call.Luhn_Summarizer(path)
            sumy_call.Edmundson_Summarizer(path)
            sumy_call.Lsa_Summarizer(path)
            sumy_call.Lex_Rank_Summarizer(path)
            sumy_call.Text_Rank_Summarizer(path)
            sumy_call.Sum_Basic_Summarizer(path)
            sumy_call.Kl_Summarizer(path)
            sumy_call.Reduction_Summarizer(path)
    #os.system('D:\\programme_driver\\cTAKES\\cTAKES_HOME\\bin\\runctakesCPE.bat')
    i = 0
    for fp in files:
        if (len(fp.split('.')) > 1):
            fp = fp.split('.')[0]
            dom = minidom.parse(dir_Edmundson_Summarizer + '\\' + fp+'_Edmundson_Summarizer.txt.xml')
            D_Ed[i] = Num_Mention('Disease',dom)
            S_Ed[i] = Num_Mention('Symptom',dom)
            P_Ed[i] = Num_Mention('Procedure',dom)
            M_Ed[i] = Num_Mention('Medicine',dom)
            A_Ed[i] = Num_Mention('Anatomy',dom)
            dom = minidom.parse(dir_Kl_Summarizer + '\\' + fp + '_Kl_Summarizer.txt.xml')
            D_Kl[i] = Num_Mention('Disease', dom)
            S_Kl[i] = Num_Mention('Symptom', dom)
            P_Kl[i] = Num_Mention('Procedure', dom)
            M_Kl[i] = Num_Mention('Medicine', dom)
            A_Kl[i] = Num_Mention('Anatomy', dom)
            dom = minidom.parse(dir_Lex_Rank_Summarizer + '\\' + fp + '_Lex_Rank_Summarizer.txt.xml')
            D_Le[i] = Num_Mention('Disease', dom)
            S_Le[i] = Num_Mention('Symptom', dom)
            P_Le[i] = Num_Mention('Procedure', dom)
            M_Le[i] = Num_Mention('Medicine', dom)
            A_Le[i] = Num_Mention('Anatomy', dom)
            dom = minidom.parse(dir_Lsa_Summarizer + '\\' + fp + '_Lsa_Summarizer.txt.xml')
            D_Ls[i] = Num_Mention('Disease', dom)
            S_Ls[i] = Num_Mention('Symptom', dom)
            P_Ls[i] = Num_Mention('Procedure', dom)
            M_Ls[i] = Num_Mention('Medicine', dom)
            A_Ls[i] = Num_Mention('Anatomy', dom)
            dom = minidom.parse(dir_Luhn_Summarizer + '\\' + fp + '_Luhn_Summarizer.txt.xml')
            D_Lu[i] = Num_Mention('Disease', dom)
            S_Lu[i] = Num_Mention('Symptom', dom)
            P_Lu[i] = Num_Mention('Procedure', dom)
            M_Lu[i] = Num_Mention('Medicine', dom)
            A_Lu[i] = Num_Mention('Anatomy', dom)
            dom = minidom.parse(dir_Reduction_Summarizer + '\\' + fp + '_Reduction_Summarizer.txt.xml')
            D_Re[i] = Num_Mention('Disease', dom)
            S_Re[i] = Num_Mention('Symptom', dom)
            P_Re[i] = Num_Mention('Procedure', dom)
            M_Re[i] = Num_Mention('Medicine', dom)
            A_Re[i] = Num_Mention('Anatomy', dom)
            dom = minidom.parse(dir_Sum_Basic_Summarizer + '\\' + fp + '_Sum_Basic_Summarizer.txt.xml')
            D_Su[i] = Num_Mention('Disease', dom)
            S_Su[i] = Num_Mention('Symptom', dom)
            P_Su[i] = Num_Mention('Procedure', dom)
            M_Su[i] = Num_Mention('Medicine', dom)
            A_Su[i] = Num_Mention('Anatomy', dom)
            dom = minidom.parse(dir_Sum_Basic_Summarizer + '\\' + fp + '_Sum_Basic_Summarizer.txt.xml')
            D_Su[i] = Num_Mention('Disease', dom)
            S_Su[i] = Num_Mention('Symptom', dom)
            P_Su[i] = Num_Mention('Procedure', dom)
            M_Su[i] = Num_Mention('Medicine', dom)
            A_Su[i] = Num_Mention('Anatomy', dom)
            dom = minidom.parse(dir_Text_Rank_Summarizer + '\\' + fp + '_Text_Rank_Summarizer.txt.xml')
            D_Te[i] = Num_Mention('Disease', dom)
            S_Te[i] = Num_Mention('Symptom', dom)
            P_Te[i] = Num_Mention('Procedure', dom)
            M_Te[i] = Num_Mention('Medicine', dom)
            A_Te[i] = Num_Mention('Anatomy', dom)
            i = i+1
    # print(D,S,P,M,A)
    # print(D_Ed,S_Ed,P_Ed,M_Ed,A_Ed)
    # print(D_Kl,S_Kl,P_Kl,M_Kl,A_Kl)
    # print(D_Le,S_Le,P_Le,M_Le,A_Le)
    # print(D_Ls,S_Ls,P_Ls,M_Ls,A_Ls)
    # print(D_Lu,S_Lu,P_Lu,M_Lu,A_Lu)
    # print(D_Re,S_Re,P_Re,M_Re,A_Re)
    # print(D_Su,S_Su,P_Su,M_Su,A_Su)
    # print(D_Te,S_Te,P_Te,M_Te,A_Te)
    valuable = np.zeros([i])
    valuable_Ed = np.zeros([i])
    valuable_Kl = np.zeros([i])
    valuable_Le = np.zeros([i])
    valuable_Ls = np.zeros([i])
    valuable_Lu = np.zeros([i])
    valuable_Re = np.zeros([i])
    valuable_Su = np.zeros([i])
    valuable_Te = np.zeros([i])
    for j in range(i):
        valuable[j] = D[j]+S[j]+P[j]+M[j]+A[j]
        valuable_Ed[j] = D_Ed[j]+S_Ed[j]+P_Ed[j]+M_Ed[j]+A_Ed[j]
        valuable_Kl[j] = D_Kl[j]+S_Kl[j]+P_Kl[j]+M_Kl[j]+A_Kl[j]
        valuable_Le[j] = D_Le[j]+S_Le[j]+P_Le[j]+M_Le[j]+A_Le[j]
        valuable_Ls[j] = D_Ls[j] + S_Ls[j] + P_Ls[j] + M_Ls[j] + A_Ls[j]
        valuable_Lu[j] = D_Lu[j] + S_Lu[j] + P_Lu[j] + M_Lu[j] + A_Lu[j]
        valuable_Re[j] = D_Re[j] + S_Re[j] + P_Re[j] + M_Re[j] + A_Re[j]
        valuable_Su[j] = D_Su[j] + S_Su[j] + P_Su[j] + M_Su[j] + A_Su[j]
        valuable_Te[j] = D_Te[j] + S_Te[j] + P_Te[j] + M_Te[j] + A_Te[j]
    percentage = 1
    percentage_Ed = np.sum(valuable_Ed)/np.sum(valuable)
    percentage_Kl = np.sum(valuable_Kl)/np.sum(valuable)
    percentage_Le = np.sum(valuable_Le)/np.sum(valuable)
    percentage_Ls = np.sum(valuable_Ls)/np.sum(valuable)
    percentage_Lu = np.sum(valuable_Lu)/np.sum(valuable)
    percentage_Re = np.sum(valuable_Re)/np.sum(valuable)
    percentage_Su = np.sum(valuable_Su)/np.sum(valuable)
    percentage_Te = np.sum(valuable_Te)/np.sum(valuable)


    data = {
        'summarizer':['original','Edmundson_Summarizer','Kl_Summarizer','Lex_Rank_Summarizer','Lsa_Summarizer','Luhn_Summarizer','Reduction_Summarizer','Sum_Basic_Summarizer','Text_Rank_Summarizer','Bert_Summarizer'],
        'Disease/Diagnosis':[np.sum(D),np.sum(D_Ed),np.sum(D_Kl),np.sum(D_Le),np.sum(D_Ls),np.sum(D_Lu),np.sum(D_Re),np.sum(D_Su),np.sum(D_Te),85],
        'Sign/Symptom':[np.sum(S),np.sum(S_Ed),np.sum(S_Kl),np.sum(S_Le),np.sum(S_Ls),np.sum(S_Lu),np.sum(S_Re),np.sum(S_Su),np.sum(S_Te),120],
        'Test/Procedure':[np.sum(P),np.sum(P_Ed),np.sum(P_Kl),np.sum(P_Le),np.sum(P_Ls),np.sum(P_Lu),np.sum(P_Re),np.sum(P_Su),np.sum(P_Te),20],
        'Medication':[np.sum(M),np.sum(M_Ed),np.sum(M_Kl),np.sum(M_Le),np.sum(M_Ls),np.sum(M_Lu),np.sum(M_Re),np.sum(M_Su),np.sum(M_Te),12],
        'Anatomy':[np.sum(A),np.sum(A_Ed),np.sum(A_Kl),np.sum(A_Le),np.sum(A_Ls),np.sum(A_Lu),np.sum(A_Re),np.sum(A_Su),np.sum(A_Te),110],
        'Percentage':[percentage,percentage_Ed.round(2),percentage_Kl.round(2),percentage_Le.round(2),percentage_Ls.round(2),percentage_Lu.round(2),percentage_Re.round(2),percentage_Su.round(2),percentage_Te.round(2),0.51]
            }

    pt.table(
        data=data,
        th_type = 'blue',
        table_type = 'striped',
        data_loc = 'center',
        th_loc = 'center',
        td_loc = 'center',
        figsize = (12,6),
        fontsize= 20
    )
    pt.show()
    # df = pd.DataFrame(data)
    #
    # fig, ax = plt.subplots(figsize=(10, 10))
    #
    # ax.axis('off')
    # ax.axis('tight')
    #
    # tb = ax.table(cellText=df.values,
    #               colLabels=df.columns,
    #               bbox=[0, 0, 1, 1],
    #               )
    # tb[0, 0].set_facecolor('#363636')
    # tb[0, 1].set_facecolor('#363636')
    # tb[0, 0].set_text_props(color='w')
    # tb[0, 1].set_text_props(color='w')
    # plt.show()
    #df = pd.DataFrame(data)
    #print(df)








if __name__ == "__main__":
    main()