
meses = ['jan','fev','mar','abr','mai','jun','jul','ago','set','out','nov','dez']
lucro = []
for mes in range(len(meses)):
    receita, despesa = input().split()
    receita = float(receita)
    despesa = float(despesa)
    din = receita-despesa
    lucro.append(din)
for mes in range(len(meses)):
    print("{} {:>4.1f}".format(meses[mes],lucro[mes]))
