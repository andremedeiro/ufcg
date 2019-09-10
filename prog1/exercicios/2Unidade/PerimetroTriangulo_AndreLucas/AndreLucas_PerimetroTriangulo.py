# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Perimetro de Triangulo

Ponto1_x=int(input())
Ponto1_y=int(input())
Ponto2_x=int(input())
Ponto2_y=int(input())
Ponto3_x=int(input())
Ponto3_y=int(input())

perimetro=((Ponto1_x - Ponto2_x)**2 + (Ponto1_y - Ponto2_y)**2 )**0.5 + ((Ponto2_x - Ponto3_x)**2 + (Ponto2_y - Ponto3_y)**2)**0.5 + ((Ponto1_x - Ponto3_x)**2 + (Ponto1_y - Ponto3_y)**2 )**0.5

print("O perímetro é de {:.2f}".format(perimetro))

