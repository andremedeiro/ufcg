# UFCG - Programacao 1 - 2019.2
# Andre Lucas Medeiros Martins - 119210592
# Numero de Disciplinas

def meu_in(elemento, lista):
    for coisa in lista:
        if coisa == elemento:
            return True
    return False

def aprovado(cursadas, requisitos):
    for disciplina in requisitos:
        if not meu_in(disciplina, cursadas):
            return False
    return True

def numero_disciplinas(grade, horarios, cursadas):
    cadeiras = {}

    for disciplina in horarios.items():
        if not meu_in(disciplina[0], cursadas):
            if aprovado(cursadas, grade[disciplina[0]]):
                if not meu_in(disciplina[1], cadeiras.values()):
                    cadeiras[disciplina[0]] = disciplina[1]

    return len(cadeiras)

    

# grade = {"p1": [], "lp1": [], "ic": [],"calc1": [], "p2": ["ic", "p1", "lp1"],"lp2": ["ic", "p1", "lp1"], "grafos": ["ic", "p1", "lp1"], "calc2":["calc1"], "edados": ["ic", "p1", "lp1", "p2", "lp2", "grafos"],"leda": ["ic", "p1", "lp1", "p2", "lp2", "grafos"]}

#horarios= {"p1": "s082", "lp1": "x082", "ic": "i142", "calc1": "q082", "p2": "t162", "lp2": "s082", "grafos": "q082", "calc2": "x162", "edados": "x162", "leda": "t102"}

#cursadas = ['ic','p1','lp1']

#print(numero_disciplinas(grade, horarios, cursadas))

