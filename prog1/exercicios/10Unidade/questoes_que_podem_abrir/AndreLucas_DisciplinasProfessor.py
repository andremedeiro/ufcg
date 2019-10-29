# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Disciplinas de um professor

def meu_in(elemento, lista):
    for coisa in lista:
        if coisa == elemento:
            return True
    return False

def disciplinas(alocacao, professor):
    creditos = 0
    disciplinas = []

    for tupla in alocacao.items():
        if meu_in(professor, tupla[1]):
            disciplinas.append(tupla[0][0])
            for prof in tupla[1]:
                if prof == professor:
                    creditos += tupla[0][1]
    tupla = (disciplinas, creditos)
    return tupla

#alocacao = {("P1", 4): ['Jorge', 'Dalton','Wilkerson'],
         ("LP1", 4): ['Jorge', 'Dalton', 'Eliane', 'Wilkerson'],
         ("EVOL", 2): ['Dalton'],
         ("IC", 4): ['Eliane', 'Joseana'],
         ("P2", 4): ['Livia', 'Raquel', 'Nazareno'],
         ("GRAFOS", 2): ['Patricia', 'Patricia']}

#print(disciplinas(alocacao, "Patricia")[1])
