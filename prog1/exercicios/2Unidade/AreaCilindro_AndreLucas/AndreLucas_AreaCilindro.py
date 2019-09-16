# UFCG - Programação 1 - 2019.2
# André Luca Medeiros Martins - 119210592
# Área do Cilindro

import math

print("Cálculo da Superfície de um Cilindro")
print("---")

diametro=float(input("Medida do diâmetro? "))
altura=float(input("Medida da altura? "))

print("---")

areaBase=math.pi * (diametro/2)**2
areaFace= 2 * math.pi * (diametro/2) * altura

area= 2 * areaBase + areaFace

print("Área calculada: {:.2f}".format(area))
