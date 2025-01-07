lista1 = []
lista2 = []
lista3 = []
lista4 = []
valor = 1

for i in range(0, 9):
    valor = int(input("Introduce un número entero a la primera lista: "))
    lista1.append(valor)

for j in range(0,3):  #lista2 = lista[:3]
    lista2.append(lista1[j])

for k in range(3,6):  #lista3 = lista[3:6]
    lista3.append(lista1[k])

for n in range(6, 9):  #lista4 = lista[6:9]
    lista4.append(lista1[n])

print(lista2)
print(lista2[::-1])
print(lista3)
print(lista3[::-1])
print(lista4)
print(lista4[::-1])