# coding: utf-8
# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Inverte Triplas

def inverte3a3(s):
    novo = ''
    for i in range(len(s)-3, -1, -3):
        string = s[i] + s[i+1] + s[i+2]
        novo += string

    return novo

#print(inverte3a3(input()))
