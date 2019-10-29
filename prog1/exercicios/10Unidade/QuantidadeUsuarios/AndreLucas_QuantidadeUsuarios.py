# UFCG - Programacao 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Quantidade de Usuarios

def quantidade_usuarios(cadastro):
    usuarios = 0
    for tupla in cadastro.items():
        if tupla[0] != 9999:
            usuarios += len(tupla[1])
    return usuarios

#lsd = {1234:['Andrey'], 1226:['Nazareno', 'Livia'], 9999:['administrador'] }
#deq = {1114:['Ana'] }
#print(quantidade_usuarios(lsd))
#print(quantidade_usuarios(deq))
