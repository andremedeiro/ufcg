# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Agrupa Negativos

def agrupa_negativos(lista):
    resultado = {"nao-negativos":[], "negativos":[]}
    
    for numero in lista:
        if numero < 0:
            resultado['negativos'].append(numero)
        else:
            resultado['nao-negativos'].append(numero)
    
    return resultado

#print(agrupa_negativos([10, -2, -7, 8]))
#print(agrupa_negativos([-1, -5]))
