lista1 = []
lista2 = []
lista3 = []
lista4 = []

for i in range(0,9):
    valores = int(input("Introduce valores a la lista: "))
    lista1.append(valores)

print(lista1)

for j in range(0,3):  #lista2 = lista[:3]
    lista2.append(lista1[j])

for k in range(3,6):  #lista3 = lista[3:6]
    lista3.append(lista1[k])

for n in range(6, 9):  #lista4 = lista[6:9]
    lista4.append(lista1[n])

print("Primera lista")

print(lista2)
print(lista2[::-1])

print("Segunda lista")
print(lista3)
print(lista3[::-1])

print("Tercera lista")
print(lista4)
print(lista4[::-1])
