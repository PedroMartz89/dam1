try:
    # Solicitar al usuario el número del mes
    mes = int(input("Introduce el número de un mes (1-12): "))

    # Verificar el número de días según el mes
    if mes == 1:
        print("Enero tiene 31 días.")
    elif mes == 2:
        print("Febrero tiene 28 o 29 días (si es año bisiesto).")
    elif mes == 3:
        print("Marzo tiene 31 días.")
    elif mes == 4:
        print("Abril tiene 30 días.")
    elif mes == 5:
        print("Mayo tiene 31 días.")
    elif mes == 6:
        print("Junio tiene 30 días.")
    elif mes == 7:
        print("Julio tiene 31 días.")
    elif mes == 8:
        print("Agosto tiene 31 días.")
    elif mes == 9:
        print("Septiembre tiene 30 días.")
    elif mes == 10:
        print("Octubre tiene 31 días.")
    elif mes == 11:
        print("Noviembre tiene 30 días.")
    elif mes == 12:
        print("Diciembre tiene 31 días.")
    else:
        print("Error: El número debe estar entre 1 y 12.")

except ValueError:
    print("Error: Entrada inválida. Por favor, introduce un número entero entre 1 y 12.")
