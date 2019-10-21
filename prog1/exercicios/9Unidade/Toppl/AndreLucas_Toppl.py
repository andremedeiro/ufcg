# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Toppl

def mover_final(indice, lista):
    for i in range(indice, len(lista)-1):
        lista[i], lista[i+1] = lista[i+1], lista[i]

def ta_na_lista(coisa, lista):
    for elemento in lista:
        if elemento == coisa:
            return True
    return False

def filtra_alunos(lista, inscritos, media):
    eliminados = 0
    
    if len(inscritos) != 0:
        for indice in range(len(lista)-1, -1, -1):
            if not ta_na_lista(lista[indice][0], inscritos) or lista[indice][1] < media:
                mover_final(indice, lista)
                lista.pop()
                eliminados += 1

        return eliminados
    
    for vez in range(len(lista)):
        lista.pop()
    
    return len(lista)

inscritos = [121,123,124]
alunos = [(121,5.5), (123,5.0), (124,5.0)]
print(filtra_alunos(alunos, inscritos, 7.0))
print(alunos)
