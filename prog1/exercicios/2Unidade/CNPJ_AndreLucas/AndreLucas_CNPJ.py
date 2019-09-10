# UFCG -2019.2
# André Lucas Medeiros Martins - 119210592
# CNPJ

raiz=input()

acumulador=0

for digito in raiz:
    if(digito != "."):
        acumulador+=int(digito)

print("{}/0001-{:02}".format(raiz, acumulador+1))
