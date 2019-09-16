# UFCG - 20419.2
# André Lucas Mederios Martins - 119210592
# Calcula Preço de Moldura

comprimento = float(input())/100
altura = float(input())/100

total_metros = comprimento*2 + altura*2

print("R$ {:.1f}".format(total_metros*120))
