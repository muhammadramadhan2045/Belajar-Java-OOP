# -*- coding: utf-8 -*-
"""
Created on Sun Sep  9 18:54:36 2018

@author: disna
"""
import math
import fileinput
print(str(16))
print(str(65536))

finalAns =["","","",""]


inpSpace=16
conceptSpace = 2**inpSpace
hypo =[]
for i in range(conceptSpace):
    l = [0] * inpSpace 
    l1 = [int(x) for x in bin(i)[2:]]
    l[inpSpace-len(l1):] = l1
    hypo.append(l)
    
    
with open("4Cat-Train.labeled", "r") as ins:
      
        count =0
        
        
        for line in ins:
            values = line.split("\t")
            
            
            liAns =[]
            for i in range(len(values)):
               
                keyVal = values[i].split(" ")
                liAns.append(keyVal[1].rstrip())
            #print(liAns)
            
            liAnsBool = [0] * 4
            
            if liAns[0]=='Young':
                liAnsBool[0] = 1
            else:
                liAnsBool[0] = 0
                
            if liAns[1]=='3':
                liAnsBool[1] = 1
            else:
                liAnsBool[1] = 0
                
            if liAns[2]=='Southampton':
                liAnsBool[2] = 1
            else:
                liAnsBool[2] = 0
                
            if liAns[3]=='Male':
                liAnsBool[3] = 1
            else:
                liAnsBool[3] = 0
            
            
            #print(liAnsBool)
            
            str1 = ''.join(str(x) for x in liAnsBool)
            #print (str1)
            
            boolVal = int(str1, 2)
            #print(boolVal)
            
            if liAns[4] =='Yes':
                hypo[:] = [x for x in hypo if x[boolVal]==1]
                        
            elif liAns[4] =='No':
                hypo[:] = [x for x in hypo if x[boolVal]==0]
                        
#print("hypo version space")
print(len(hypo))

for line in fileinput.input():
    values = line.split("\t")
            
    liAns =[]
    for i in range(len(values)):
               
        keyVal = values[i].split(" ")
        liAns.append(keyVal[1].rstrip())
        #print(liAns)
            
    liAnsBool = [0] * 4
            
    if liAns[0]=='Young':
        liAnsBool[0] = 1
    else:
        liAnsBool[0] = 0
                
    if liAns[1]=='3':
        liAnsBool[1] = 1
    else:
        liAnsBool[1] = 0
                
    if liAns[2]=='Southampton':
        liAnsBool[2] = 1
    else:
        liAnsBool[2] = 0
                
    if liAns[3]=='Male':
        liAnsBool[3] = 1
    else:
        liAnsBool[3] = 0
            
            
            #print(liAnsBool)
            
    str1 = ''.join(str(x) for x in liAnsBool)
            #print (str1)
            
    boolVal = int(str1, 2)
        
    yesCount =0
    noCount =0
    for h in hypo:
        if h[boolVal]==1:
            yesCount +=1
        elif h[boolVal]==0:
            noCount +=1
    print(str(yesCount)+" "+str(noCount))
             