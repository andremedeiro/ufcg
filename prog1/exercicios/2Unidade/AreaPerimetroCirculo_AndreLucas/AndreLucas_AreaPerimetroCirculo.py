# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592

# Area e Perimetro de um circulo

import math

raio = int(input())/2

area = math.pi * raio**2
perimetro = 2 * math.pi * raio

print("A: {:.5f}".format(area))
print("P: {:.5f}".format(perimetro))
