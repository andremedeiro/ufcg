# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Calcula Despesas do Cinema

orcamento = float(input("Orçamento? R$ "))
num_adultos = int(input("Número de adultos? "))
num_criancas = int(input("Número de crianças? "))
pizza = float(input("Preço da pizza? R$ "))
refrigerante = float(input("Preço do refrigerante? R$ "))
estacionamento = float(input("Preço do estacionamento? R$ "))
ingresso = float(input("Preço do ingresso do cinema? R$ "))

alimentacao = pizza + refrigerante

adultos = num_adultos * (ingresso + 2)
criancas = num_criancas * (ingresso/2 + 2)
cinema = adultos + criancas
por_pessoa = (cinema + alimentacao + estacionamento) / (num_adultos + num_criancas)

total = alimentacao + cinema + estacionamento
saldo = orcamento - total

print("========== Despesas do cinema ==========")
print("Alimentacao: R$ {:.2f}".format(alimentacao))
print("Cinema: R$ {:.2f}".format(cinema))
print("Custo médio por pessoa: R$ {:.2f}".format(por_pessoa))
print("Total: {:.2f}".format(total))
print("Saldo após passeio: {:.2f}".format(saldo))
