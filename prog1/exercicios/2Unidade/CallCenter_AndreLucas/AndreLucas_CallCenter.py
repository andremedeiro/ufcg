# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Callcenter

total_Atendimentos=0

for dia in range(7):
    atendimentos=int(input())
    total_Atendimentos += atendimentos

print("Total: {}".format(total_Atendimentos))
print("Média: {:.2f}".format(total_Atendimentos/7))
