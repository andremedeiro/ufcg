# UFCG - Programação 1 - 2019.2
# André Lucas Medeios Martins - 119210592
# Senos e Cossenos

angulo = float(input())
delta = float(input())
quantidade = int(input())

def calculaSeno(angulo):
    return(0)

def calculaCosseno(angulo):
    return(0)

print('|Angulo|   Seno|Cosseno|')

for vez in range(quantidade):
    print('|{:' '6.1f}|{:.5f}|{:.5f}|'.format(angulo, calculaSeno(angulo), calculaCosseno(angulo)))
    angulo += delta

