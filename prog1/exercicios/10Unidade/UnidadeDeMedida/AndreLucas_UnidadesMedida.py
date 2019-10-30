# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Unidades de Medida

unidades = {'km': 1000, 'hm': 100, 'dam': 10, 'm': 1, 'dm': 0.1, 'cm': 0.01, 'mm': 0.001}

resultados = []

while True:
    valores = input().split()
    soma = 0

    for indice in range(0, len(valores), 2):
        soma += int(valores[indice]) * unidades[valores[indice+1]]
    
    if soma == 0:
        break
    else:
        resultados.append('{:.2f} m'.format(soma))

for resultado in resultados:
    print(resultado)
