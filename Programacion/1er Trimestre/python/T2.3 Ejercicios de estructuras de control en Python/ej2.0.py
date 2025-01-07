num = int(input("Introduce un numero entero: "))

if num < 1:
    print("El numero introducido no es correcto")

else:

    print("Números pares:")

    for i in range (0,num+1):
        if (i % 2 == 0):
            print(i)
    
    print("Números impares:")

    for i in range (0,num+1):
        if (i % 2 != 0):
            print(i)       
