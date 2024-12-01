mi_lista = [87, 94, 45, 41, 65, 94, 41, 99, 94]
milista_duplicada = []
for i in mi_lista[:]:

    if i not in milista_duplicada:

        milista_duplicada.append(i)
    else:
        continue


tupla = tuple(milista_duplicada)

maximo = max(milista_duplicada)
minimo = min(milista_duplicada)
print(milista_duplicada)
print(tupla)
print(maximo)
print(minimo)