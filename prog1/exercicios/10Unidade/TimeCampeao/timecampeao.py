# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Time Campeão

def time_campeao(dados):
    campeao = []
    
    maior = ''
    
    for time in dados.keys():
        if maior == '':
            maior = time

        if dados[time][0] > dados[maior][0]:
            maior = time
    
    for time in dados.keys():
        if dados[time][0] == dados[maior][0]:
            campeao.append(time)

    return campeao

#dados = {"Botafogo": [80, 43, 39], "São Paulo": [52, 44, 36], "Palmeiras": [80, 62, 32], "Santos": [72, 59, 35]}

#print(time_campeao(dados))
