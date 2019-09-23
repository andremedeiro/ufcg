# UFCG - Programação 1 - 2019.2
# André Lucas Mederios Martins - 119210592
# Chave Segura

chave = input().lower()
vog = 0
aux = 0
for z in range(2):
    if chave[z] in 'AEIOUaeiou':
        vog +=1
if len(chave) >= 3:
    while aux == 0:
        for i in range(2,len(chave)):
            if chave[i] == chave[i-1] and chave[i] == chave[i-2] and aux == 0:
                print('Chave insegura. 3 caracteres consecutivos iguais.')
                aux = 1
                break
            if chave[i] in 'AEIOUaeiou':
                vog +=1
            if vog > 5:
                print('Chave insegura. 6 vogais.')
                aux = 1
                break
        if aux == 1:
            break
        if aux == 0 and vog <= 5:
            print('Chave segura!')
            aux = 1
