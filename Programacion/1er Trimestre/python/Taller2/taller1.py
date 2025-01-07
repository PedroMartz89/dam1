lista1 = []
lista2 = []
lista3 = []

while True:

    valor1= int(input("Introduce valores a la lista 1 (0 para salir): "))
    if valor1 == 0:
        break
    else:
        lista1.append(valor1)
    
while True:

    valor2 = int(input("Introduce valores a la lista 2 (0 para salir): "))
    
    if valor2 == 0:
        break
    else:
        lista2.append(valor2)
    
    
for i in range [0::2]:
    lista3.append(i)


for j in range(0, len(lista2), 2):
    entrada2 = lista2[j]
    lista3.append(entrada2)

print(lista3)

