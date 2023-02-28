# -*- coding: utf-8 -*-
"""
Created on Sat Sep  8 20:38:39 2018

@author: disna
"""
import fileinput
print (str(512))
a = 2**512
print (len(str(a)))
print(str(19684))
print(str(59050))
print(str(26245))

finalAns =["","","","","","","","",""]
with open("9Cat-Train.labeled", "r") as ins:
      
        count =0
        
        
        for line in ins:
            values = line.split("\t")
            
            
            liAns =[]
            for i in range(len(values)):
               
                keyVal = values[i].split(" ")
                liAns.append(keyVal[1].rstrip())
            
            if liAns[9]=='Yes':
                #print(liAns[:10])
                if finalAns[0]=="":
                    finalAns = liAns[:9]
                    #print ("finalAns is...")
                    #print (finalAns)
                else:
                    for i in range(len(finalAns)):
                        if liAns[i]!=finalAns[i]:
                            finalAns[i]='?'
                    #print("final Ans is..")
                    
            count +=1
            
            if count%20==0:
                with open('partA6.txt', 'a') as the_file:
                    the_file.write('\t'.join([str(x) for x in finalAns])+"\n")               

##
with open("9Cat-Dev.labeled", "r") as ins:
    misclass =0
    count=0
    for line in ins:
        values = line.split("\t")
            
            
        liAns =[]
        for i in range(len(values)):
             
            
            keyVal = values[i].split(" ")
            liAns.append(keyVal[1].rstrip())
            
        pred =1
        for i in range(len(finalAns)):
            if finalAns[i]!='?' and finalAns[i]!=liAns[i]:
                pred=0
                break
        if ((pred==1 and liAns[9]=='No') or (pred==0 and liAns[9]=='Yes')):
            misclass +=1
        count+=1
print(misclass/count)


for line in fileinput.input():
    values = line.split("\t")
            
    liAns =[]
    for i in range(len(values)):
        keyVal = values[i].split(" ")
        liAns.append(keyVal[1].rstrip())
    pred =1
    for i in range(len(finalAns)):
        if finalAns[i]!='?' and finalAns[i]!=liAns[i]:
            pred=0
            break
    if pred==0:
        print("No")
    else:
        print("Yes")
    
            
        
            