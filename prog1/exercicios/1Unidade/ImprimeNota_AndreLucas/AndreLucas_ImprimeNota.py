# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Imprime Nota Fiscal

valor_total = float(input())
data = input()
quantidade_de_produtos = int(input())

print("Data: {}".format(data))
print("O valor total da compra foi de R$ {:.2f}. A média do preço dos produtos é de {:.1f}.".format( valor_total, valor_total/quantidade_de_produtos ))
