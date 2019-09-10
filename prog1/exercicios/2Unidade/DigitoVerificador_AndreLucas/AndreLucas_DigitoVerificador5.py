# UFCG - 2019.2
# André Lucas Mederios Martins - 119210592
# Digito Verificador de 5 Digitos

numerodaconta=input()

acumulador=0

for digito in numerodaconta:
    acumulador += int(digito)

numero_verificador=acumulador%11

print("{}-{:02}".format(numerodaconta,numero_verificador))



