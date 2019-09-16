# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# MRV

posicao_inicial = float(input("Posição inicial? "))
velocidade_inicial = float(input("Velocidade inicial? "))
tempo = float(input("Tempo? "))
aceleracao=float(input("Aceleração? "))

print("\nDados da questão")
print("================")

velocidade_final = velocidade_inicial + aceleracao * tempo
velocidade_media = (velocidade_inicial + velocidade_final)/2
posicao_final = posicao_inicial + velocidade_inicial * tempo + (aceleracao * tempo**2)/2

print("   Posição inicial: {:.2f} m".format(posicao_inicial))
print("Velocidade inicial: {:.2f} m/s".format(velocidade_inicial))
print("        Aceleração: {:.2f} m/s2".format(aceleracao))
print("             Tempo: {:.2f} s".format(tempo))
print("  Velocidade final: {:.2f} m/s".format(velocidade_final))
print("  Velocidade média: {:.2f} m/s".format(velocidade_media))
print("     Posição final: {:.2f} m".format(posicao_final))

