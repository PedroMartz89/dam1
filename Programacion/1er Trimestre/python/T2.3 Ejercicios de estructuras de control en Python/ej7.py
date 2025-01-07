num = int(input("Introduce un número entero y positivo: "))
contador = 0
total = num
producto = num

if num > 0:

    while total >= 1:
        total = total / 10
        contador = contador + 1

    print("El numero de digitos del numero", num, " es: ", contador)

else:
    print("El número introducido no es correcto")