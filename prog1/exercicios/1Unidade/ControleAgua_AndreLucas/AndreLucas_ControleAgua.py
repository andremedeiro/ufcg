# UFCG - 2019.2
# André Luca Medeiros Martins - 119210592
# Controle de Água

import math

velocidade = float(input())
secao = math.pi * (float(input()) / 2) ** 2
vazao = velocidade * secao * 1000
tempo = float(input())
quant_agua = tempo * vazao

print("Quantidade de água = {:.2f} litros.".format(quant_agua))
