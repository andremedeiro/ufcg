# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Ocorrencias Letra

letras = {}

frase = input().lower()

for elemento in frase:
    if elemento != ' ':
        try:
            letras[elemento] += 1
        except:
            letras[elemento] = 0
            letras[elemento] += 1

letra = 'a'
maior = 0
for tupla in letras.items():
    if tupla[1] > maior:
        letra = tupla[0] 
        maior = tupla[1]

print(letra, maior)
