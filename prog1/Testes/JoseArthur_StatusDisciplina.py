# Codigo que Zé tá com problema

# notas:
nota1 = float(input())
nota2 = float(input())
nota3 = float(input())

# media
media = (nota1 + nota2  + nota3)/3

# total de faltas do aluno
faltas = int(input())

# Porcentagem  de faltas:
porcentagemFaltas = faltas/30 * 100

# O aluno tem que ter 75% de presença, então tem que ter menos de 25% de falta
# entao se a porcentagem de falta for maior que 25, faltou demais preiboi

if porcentagemFaltas > 25.0:
    print('reprovado por faltas')

elif media < 7:
    print('reprovado por nota')

elif porcentagemFaltas <= 25.0 and (media >= 4 and media < 7):
    print('prova final')

else:
    print('aprovado por media')
