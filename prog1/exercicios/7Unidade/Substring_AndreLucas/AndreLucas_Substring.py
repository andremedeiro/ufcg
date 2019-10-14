# coding: utf-8
# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Substring

def is_substring(str1, str2):
    if len(str1) >= len(str2):
        for indice in range(len(str1)):
            if str1[indice] == str2[0]:
                pedaco = ''
                for x in range(indice, indice + len(str2)):
                    pedaco += str1[x]
                if pedaco == str2:
                    return True

    return False

#print(is_substring('casoriocasa','casa'))
