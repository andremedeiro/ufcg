# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Calculo de Tintas

altura=float(input())
largura=float(input())

area=altura*largura
quantidade_tinta=(3.6 * area)/50
print("{:.2f} l".format(quantidade_tinta))
