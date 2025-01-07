import math

def muestra():
    numeros = []

    while True:
        valor = input("Introduce valores a la lista (fin para salir):")
        if valor.lower() == "fin":
            break
        try:
            numeros.append(float(valor))
        except ValueError:
            print("Introduce un número válido")
    
    suma = sum(numeros)
    media = suma / len(numeros)

    varianza = sum((x - media) ** 2 for x in numeros) / len(numeros)

    desviacion = math.sqrt(varianza)

    diccionario = {

        "media_lista": media,
        "varianza_lista": varianza,
        "desviacion_lista": desviacion,
    }

    print(diccionario)

muestra()