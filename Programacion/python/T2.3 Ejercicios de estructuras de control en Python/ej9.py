array = []
num = 0
i = 0
pares  = 0
impares = 0

try:

    while True:
        num = int(input("Introduce un número positivo (0 para parar de introducir datos): "))
        if num != 0:
            array.append(num)
        else:
            print("Realizando cálculos...")
            break     

    while i < len(array):
        if array[i] % 2 == 0:
            pares += 1
        else:
            impares += 1
        i += 1
        
    print("La cantidad de números pares es: ", pares)
    print("La cantidad de números pares es: ", impares)

except ValueError:
    print("El número introducido no es correcto, debe ser un número entero")