# UFCG - 2019.2
# André Lucas Medeiros Martins - 119210592
# Tweets por Página

total_tweets = int(input())

paginas = total_tweets//400

porcentagem = ((total_tweets - paginas*400)/total_tweets)*100

print("Serão necessárias {} página(s) para visualizar os tweets.".format(paginas))
print("{:.1f}% dos tweets serão perdidos.".format(porcentagem))

