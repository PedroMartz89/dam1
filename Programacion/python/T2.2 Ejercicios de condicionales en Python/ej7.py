try:
    # Solicitar al usuario una nota
    nota = float(input("Introduce una nota numérica entre 0 y 10: "))

    # Verificar si la nota está en el rango válido
    if 0 <= nota <= 10:
        # Determinar la calificación según el rango de la nota
        if 0 <= nota <= 4:
            print("Calificación: Insuficiente")
        elif 5 <= nota <= 6:
            print("Calificación: Suficiente")
        elif 7 <= nota <= 9:
            print("Calificación: Notable")
        elif nota == 10:
            print("Calificación: Sobresaliente")
    else:
        print("Error: La nota debe estar entre 0 y 10.")

except ValueError:
    print("Error: Entrada inválida. Por favor, introduce un número entre 0 y 10.")
