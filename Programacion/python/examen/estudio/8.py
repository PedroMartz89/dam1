lista1 = [1, 32, 5, 7, 21, 22, 54]
lista2 = [4, 1, 241, 65, 422, 7, 65]
i = 0
j = 0
lista3 = []

for i in range (0,len(lista1)):

    if lista1[i] % 2 != 0:
        lista3.append(lista1[i])


for j in range(0, len(lista2)):

    if lista2[j] % 2 == 0:
        lista3.append(lista2[j])

print(lista3)