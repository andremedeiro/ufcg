# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Toppl

def filtra_alunos(lista, inscritos, media):
    eliminados = 0

    if len(inscritos) != 0:
        for indice in range(len(lista)-1, -1, -1):
            if lista[indice][0] not in inscritos:
                for i in range(indice, len(lista)-1):
                    lista[i], lista[i+1] = lista[i+1], lista[i]
                lista.pop()
                eliminados += 1
        
        for indice in range(len(lista)-1, -1, -1):
            if lista[indice][1] < media:
                for i in range(indice, len(lista)-1):
                    lista[i], lista[i+1] = lista[i+1], lista[i]
                lista.pop()
                eliminados += 1

        return eliminados

    return len(eliminados)

#inscritos = [121, 123, 124]
#alunos = [ (120,8.0), (121,7.5), (122,5.0), (123,6.0), (124,9.0), (125,4.0) ]
#print(filtra_alunos(alunos, inscritos, 7.0))
#print(alunos)
