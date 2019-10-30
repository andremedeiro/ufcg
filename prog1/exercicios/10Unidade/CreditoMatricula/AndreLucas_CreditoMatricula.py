# UFCG - Programcao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Creditos Matricula

def meu_in(elemento, lista):
    for coisa in lista:
        if coisa == elemento:
            return True
    return False

def num_creditos(bd_ufcg, matricula):
    creditos = 0

    for dicionario in bd_ufcg.values():
        for tupla in dicionario.items():
            if meu_in(matricula, tupla[1]):
                creditos += tupla[0][1]
    
    return creditos

#bd_ufcg = {"UASC": {("Programação I", 4): ["11624100", "11624400"], ("Programação II", 4): ["11624200"], ("Teoria dos Grafos", 2): ["11624200"]},"UAF": {("Física Clássica", 4): ["11624200"], ("Física Moderna", 4): ["11624300", "11624500", "11624600"]}, "UAM": {("Cálculo I", 4): ["11624100", "11624300"], ("Álgebra Linear",): ["11624300"]}}
#print(num_creditos(bd_ufcg, "11624100"))
