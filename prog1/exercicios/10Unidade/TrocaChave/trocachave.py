# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Troca Chave

def troca_chave(dic):
    inverso = {}

    for elemento in dic.items():
        inverso[elemento[1]] = elemento[0]

    return inverso

#dic = {1:2, 2:3, 3:4}
#print(troca_chave(dic))
