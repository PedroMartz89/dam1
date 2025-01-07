num = int(input("Introduce un numero entero: "))

numPar = []
numImpar = []

if num < 1:
    print("El numero introducido no es correcto")

else:

    for i in range (0,num+1):
        if (i % 2 == 0):
            numPar.append(i)
        else:
            numImpar.append(i)

print("Los pares son ", numPar)     
print("Los impares son ", numImpar)     
       
