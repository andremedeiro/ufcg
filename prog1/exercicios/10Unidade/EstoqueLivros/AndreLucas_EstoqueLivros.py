# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Estoque de Livros

def ausentes(estoque):
    ausentes = 0
    for tupla in estoque.items():
        if tupla[1] == 0:
            ausentes += 1
    return ausentes

#lsd = {1234:0, 1226:['Nazareno', 'Livia'], 9999:['administrador'] }
#print(ausentes(lsd))
