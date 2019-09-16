# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Quadrado na Circunferência

import math

lado_quadrado=float(input())

raio=(lado_quadrado**2 + lado_quadrado**2)**0.5/2

perimetro=2 * math.pi * raio
area= math.pi * raio**2

print("Perímetro: {:.5f}".format(perimetro))
print("Área: {:.5f}".format(area))
