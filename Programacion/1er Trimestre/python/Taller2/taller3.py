mi_lista = [47, 64, 69, 37, 76, 83, 95, 97]
mi_listafiltrada= []
mi_diccionario = {

    'Antonio': 47,
    'Manuel': 69,
    'Ana': 76,
    'Aurora': 97
}


for i in mi_lista[:]: #hacer una copia de la lista para no modificar la original
    if i in mi_diccionario.values():
        continue
    else:
        mi_lista.remove(i)

print(mi_lista)
