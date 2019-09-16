# UFCG - Programação 1 - 2019.2
# André Lucas Medeios Martins - 119210592
# Senos e Cossenos

import math

angulo = float(input())
delta = float(input())
quantidade = int(input())

print('|Angulo|   Seno|Cosseno|')

for vez in range(quantidade):

    seno = math.sin(math.radians(angulo))
    cosseno = math.cos(math.radians(angulo))

    print('|{:' '6.1f}|{:.5f}|{:.5f}|'.format(angulo, seno, cosseno))
    angulo += delta

