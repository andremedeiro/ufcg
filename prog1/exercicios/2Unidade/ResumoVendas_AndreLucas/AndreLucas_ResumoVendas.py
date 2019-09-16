# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Resumo de Vendas

total=int(input())
venda_teresa=int(input())
venda_carla=int(input())

venda_joaquim=total-venda_teresa-venda_carla

porcentagem_teresa=(venda_teresa/total)*100
porcentagem_carla=(venda_carla/total)*100
porcentagem_joaquim=(venda_joaquim/total)*100

print("Teresa vendeu {} (de {}) brinquedos. ({:.2f}%)".format(venda_teresa, total, porcentagem_teresa))
print("Joaquim vendeu {} (de {}) brinquedos. ({:.2f}%)".format(venda_joaquim, total, porcentagem_joaquim))
print("Carla vendeu {} (de {}) brinquedos. ({:.2f}%)".format(venda_carla, total, porcentagem_carla))


