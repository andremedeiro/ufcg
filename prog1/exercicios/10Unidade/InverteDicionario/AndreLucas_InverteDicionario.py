# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Inverte Dicionario

letras = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

def get_indice(objeto, lista):
    for indice in range(len(lista)):
        if lista[indice] == objeto:
            return indice 

def insere_ordenado(letra, lista):
    lista.append(letra)
    if len(lista) > 1:
        for indice in range(len(lista)):
            if get_indice(letra, letras) < get_indice(lista[indice], letras):
                for i in range(len(lista)-1, indice, -1):
                    lista[i], lista[i-1] = lista[i-1], lista[i]
                break

def inverte_dicionario(dicionario):
    inverso = {}

    for tupla in dicionario.items():
        try:
            insere_ordenado(tupla[0], inverso[tupla[1]])
        except:
            inverso[tupla[1]] = []
            insere_ordenado(tupla[0], inverso[tupla[1]])

    return inverso

#m = {"c": 2, "b": 3, "a": 2}
#print(inverte_dicionario(m))

