# UFCG  - Programcao 1 - 2019.2
# Andre Lucs Medeiros Martins - 119210592
# Colegas em sala

def colegas_de_sala(salasprofs, prof):
    colegas = []
    for tupla in salasprofs.items():
        if tupla[0] != prof and tupla[1] == salasprofs[prof]:
            colegas.append(tupla[0])
    return colegas

#salasprofs = {'franklin': 206, 'tiago': 206, 'eline': 206, 'adalberto': 209, 'wilkerson': 207, 'dalton': 204, 'jorge': 204}
#print(colegas_de_sala(salasprofs, 'adalberto'))
