# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Roteiro Aeroportos

def meu_in(elemento, lista):
    for coisa in lista:
        if elemento == coisa:
            return True
    return False

def eh_roteiro(iata, voos, roteiro):
    roteiro = roteiro.split('/')

    for indice in range(len(roteiro)-1):
        if not meu_in(iata[roteiro[indice+1]], voos[iata[roteiro[indice]]]):
            return False
    
    return True


#iata = {"Campina Grande": "CPV","Recife": "REC","Salvador": "SSA","Brasilia": "BSB","Sao Paulo": "GRU","Rio de Janeiro": "GIG"}

#voos = {"CPV": ["REC", "SSA"],"REC": ["CPV", "BSB", "GRU", "GIG"],"SSA": ["REC", "GRU", "GIG"],"BSB": ["CPV", "GIG", "GRU"],"GRU": ["GIG", "BSB"],"GIG": ["GRU", "REC"]}

#print(eh_roteiro(iata, voos, "Campina Grande/Recife/Rio de Janeiro"))
#print(eh_roteiro(iata, voos, "Sao Paulo/Rio de Janeiro/Recife/Brasilia"))
#print(eh_roteiro(iata, voos, "Recife/Rio de Janeiro/Salvador/Recife"))

