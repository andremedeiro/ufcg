# UFCG - Proggramação 1 - 2019.2
# André Lucas Medeiros Martins
# Converte Senha

palavra = input()
criptografada = list(palavra)
trocas = 0
palavraCodificada = ''

for indice in range(len(criptografada)):
    if indice != 0:
        if criptografada[indice] == 'a' or criptografada[indice] == 'A':
            palavraCodificada += '4'
            trocas += 1
        elif criptografada[indice] == 'e' or criptografada[indice] == 'E':
            palavraCodificada += '3'
            trocas += 1
        elif criptografada[indice] == 'i' or criptografada[indice] == 'I':
            palavraCodificada += '1'
            trocas += 1
        elif criptografada[indice] == 'o' or criptografada[indice] == 'O':
            palavraCodificada += '0' 
            trocas += 1
        else:
            palavraCodificada += criptografada[indice]
    else:
        palavraCodificada += criptografada[indice]

print('{} ({} troca(s))'.format(palavraCodificada, trocas))
