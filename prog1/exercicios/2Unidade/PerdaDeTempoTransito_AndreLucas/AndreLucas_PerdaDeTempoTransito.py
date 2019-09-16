# UFCG - Programação 1 - 2019.2
# André Lucas Medeiros Martins - 119210592
# Perda de Termpo no Trânsito

minutos_semana=7200
tempo_gasto=0

for dia in range(5):
    tempo_gasto += int(input())

media_tempo = tempo_gasto/5

produtividade=(tempo_gasto/7200)*100

quantidade_episodios=tempo_gasto//50

print("Você perdeu {} min na semana (média de {:.1f} min por dia).".format(tempo_gasto, media_tempo))
print("Isso significa {:.2f}% da sua semana produtiva.".format(produtividade))
print("Daria para assistir {} episódio(s) de House.".format(quantidade_episodios))
