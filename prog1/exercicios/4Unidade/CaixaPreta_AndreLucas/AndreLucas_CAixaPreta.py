# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 2019.2
# Caixa Preta

quantidade = int(input())

dadosValidos = 0
dadosInvalidos = False
for vez in range(quantidade):
    lista = input().split()
    if dadosInvalidos == False:
        for indice in range(len(lista)):
            if indice == 0 and int(lista[indice]) < 0:
                print('dado inconsistente. peso negativo.')
                dadosInvalidos = True
                break
            elif indice == 1 and int(lista[indice]) < 0:
                print('dado inconsistente. combustível negativo.')
                dadosInvalidos = True
                break

            elif indice == 2 and int(lista[indice]) < 0:
                print('dado inconsistente. altitude negativa.')
                dadosInvalidos = True

            else:
                dadosValidos += 1

print('{} dados válidos.'.format(dadosValidos))
