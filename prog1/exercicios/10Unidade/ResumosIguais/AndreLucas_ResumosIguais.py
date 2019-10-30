# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Resumo Iguais

def agrupa_resumos_iguais(lista):
    resumos = {}
    for numero in lista:
        resumo = 0
        for algarismo in str(numero):
            resumo += int(algarismo)
        try:
            resumos[resumo].append(numero)
        except:
            resumos[resumo] = []
            resumos[resumo].append(numero)
    return resumos

#lista1 = [60, 343, 19, 1230, 51, 123]
#print(agrupa_resumos_iguais(lista1))
