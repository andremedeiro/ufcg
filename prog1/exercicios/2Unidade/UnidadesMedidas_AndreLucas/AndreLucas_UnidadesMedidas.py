# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Unidades e Medidas

centimetros=float(input())*100

# 1 jarda = 3 pés = 36 polegadas = 91.44 centimetros

jardas= centimetros/91.44
pes=jardas*3
polegadas=pes*12

print("Jardas: {:.3f} yd".format(jardas))
print("Pés: {:.3f} ft".format(pes))
print("Polegadas: {:.3f} in".format(polegadas))

