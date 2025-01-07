while True:
    print("\nCalculadora")
    print("Selecciona una operación:")
    print("1. Suma")
    print("2. Resta")
    print("3. Multiplicación")
    print("4. División")
    print("5. Salir")
    
    operacion = input("Introduce el número de la operación a realizar (1/2/3/4/5): ")

    if operacion == '5':
        print("Saliendo de la calculadora...")
        break

    if operacion not in ('1', '2', '3', '4'):
        print("Operación no válida. Inténtalo de nuevo.")
        continue

    try:
        numero1 = float(input("Introduce el primer número: "))
        numero2 = float(input("Introduce el segundo número: "))
    except ValueError:
        print("Entrada inválida. Por favor, introduce números válidos.")
        continue

    if operacion == '1':
        resultado = numero1 + numero2
        print(f"{numero1} + {numero2} = {resultado}")

    elif operacion == '2':
        resultado = numero1 - numero2
        print(f"{numero1} - {numero2} = {resultado}")

    elif operacion == '3':
        resultado = numero1 * numero2
        print(f"{numero1} * {numero2} = {resultado}")

    elif operacion == '4':
        if numero2 == 0:
            print("Error: No se puede dividir por cero.")
        else:
            resultado = numero1 / numero2
            print(f"{numero1} / {numero2} = {resultado}")
