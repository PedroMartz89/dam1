mi_lista = [87, 94, 45, 41, 65, 94, 41, 99, 94]
mi_lista_cambiada = []

mi_lista_cambiada = list(set(mi_lista))

print("Lista sin duplicados:")
print(mi_lista_cambiada)

tupla = tuple(mi_lista_cambiada)

print("Tupla:")
print(tupla)

print(f"El valor máximo es {max(tupla)}")
print(f"El valor mínimo es {min(tupla)}")


