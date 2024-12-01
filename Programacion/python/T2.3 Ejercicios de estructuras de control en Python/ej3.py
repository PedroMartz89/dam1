num = int(input("Introduce un numero entero: "))

numPar = []
numImpar = []
totalPar=0
totalImpar=0

if num < 1:
    print("El numero introducido no es correcto")

else:

    for i in range (0,num+1):
        if (i % 2 == 0):
            totalPar = totalPar + i
        else:
            totalImpar = totalImpar + i

print("La suma de los pares es: ", totalPar)     
print("La suma de los impares es: ", totalImpar)     
