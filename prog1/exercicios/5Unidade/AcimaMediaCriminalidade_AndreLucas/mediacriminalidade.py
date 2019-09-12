# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Acima da Média - Criminalidade

mediaSSP = float(input())

AcimaDaMedia = []

sequencia = input()

while sequencia != 'fim':
    media =  0
    for valor in sequencia.split():
        media += int(valor)
    
    media = media/len(sequencia.split())
    
    if media >= mediaSSP:
        AcimaDaMedia.append(sequencia)
   
    elif media <= mediaSSP/2:
        break

    sequencia = input()
    
for sequencia in AcimaDaMedia:
    print(sequencia)
   
