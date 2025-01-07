num=int(input("Hasta que número de la secuencia Fibonacci quieres calcular?: "))

listaFibbonacci=[0,1]

for i in range(2, num):
    temp = listaFibbonacci[i-1] + listaFibbonacci[i-2]
    listaFibbonacci.append(temp)

print(" ".join(map(str, listaFibbonacci)))