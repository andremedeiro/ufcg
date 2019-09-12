# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Média dos Extremos

quantidade = int(input())

lista = []

for vez in range(quantidade):
    numero = int(input())
    if vez == 0:
        extremo1 = numero
        maior = numero
        menor = numero
    elif vez == quantidade - 1:
        extremo2 = numero
    
    if numero > maior:
        maior = numero
    
    elif numero < menor:
        menor = numero

    lista.append(numero)

media = (maior + menor)/2

acima = 0 
abaixo = 0

for numero in lista:
    if numero > media:
        acima += 1
    elif numero < media:
        abaixo += 1

print('Menor número: {}'.format(menor))
print('Maior número: {}'.format(maior))
print('Média dos extremos: {:.2f}'.format(media))
print('{} número(s) abaixo da média'.format(abaixo))
print('{} número(s) acima da média'.format(acima))
