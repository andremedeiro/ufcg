# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Quadrado na Circunferência

import math

raio=float(input())

lado=raio * 2**0.5

area_quadrado=lado**2
area_circunferencia= math.pi * raio**2

print("Área não comum: {:.5f}".format(area_circunferencia - area_quadrado))

