contador = 0
i = 0
num = 1


for i in range (1, 10+1):
    
    lista = [i * j for j in range(1, 11)]

    print(" ".join(map(str, lista)))



