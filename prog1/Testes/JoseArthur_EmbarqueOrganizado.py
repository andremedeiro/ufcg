# UFCG - Programação 1 - 2019.2
# André Lucas Mederios MArtins- 119210592
# Embarque Organizado

sequencia_embarque = input().split()

situacao_embarque = 'ok'
par = False

for numero in sequencia_embarque:
    if int(numero)%2 == 0:
         par = True
    
    if int(numero)%2 == 1 and par:
        situacao_embarque = 'erro'
        break

print(situacao_embarque)
