miArray = []
valor = 0

try:

    while True:
    
        valor = int(input("Introduce un valor (0 para salir): "))

        if valor > 150 and valor <= 500:
            continue
        if valor > 500:
            break
        else:
            miArray.append(valor)
    
    print("Múltiplos de 5:")

    for i in range (0, len(miArray)):
        if miArray[i] % 5 == 0:
            print(miArray[i])

except ValueError:

    print("El valor introducido no es válido")