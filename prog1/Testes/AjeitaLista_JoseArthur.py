def acha_valor(lista, inicio, fim, resto):
    for indice in range(inicio, fim):
        if lista[indice]%2 == resto:
            return indice

def ajeita_lista(lista):
    indice_maior_par = acha_valor(lista, 0, len(lista), 0)
    indice_maior_impar = acha_valor(lista, 0, len(lista), 1)

    inicio_procura = 0
    fim_procura = len(lista)

    for vez in range(len(lista)//2):
        for indice in range(inicio_procura, fim_procura):
            if lista[indice]%2 == 0:
                if lista[indice] > lista[indice_maior_par]:
                    indice_maior_par = indice
            else:
                if lista[indice] > lista[indice_maior_impar]:
                    indice_maior_impar = indice

        lista[indice_maior_par], lista[inicio_procura] = lista[inicio_procura], lista[indice_maior_par]
        
        if indice_maior_par != fim_procura and indice_maior_impar != inicio_procura:
            lista[indice_maior_impar], lista[fim_procura-1] = lista[fim_procura-1], lista[indice_maior_impar]

        inicio_procura += 1
        fim_procura -= 1

        indice_maior_par = acha_valor(lista, inicio_procura, fim_procura, 0)
        indice_maior_impar = acha_valor(lista, inicio_procura, fim_procura, 1)

lista = [3,2,1,4,5,6,7,8,9]
print(lista)
ajeita_lista(lista)
print(lista)
