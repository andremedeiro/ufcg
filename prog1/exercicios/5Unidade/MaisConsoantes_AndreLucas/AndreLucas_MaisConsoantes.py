# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Mais Consoantes

contador = 0

while True:
    palavra = input()
    contador += 1
    vogais = 0
    
    for letra in palavra:
        if letra in "aeiouAEIOU":
            vogais += 1
    
    if len(palavra)-vogais > vogais:
        break

print(contador)
