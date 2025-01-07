def diccionario (cadena):

    palabras = cadena.split()
    frecuencia_palabras = {}

    for i in palabras:
        if i in frecuencia_palabras:
            frecuencia_palabras[i] += 1
        
        else:
            frecuencia_palabras[i] = 1

    print(frecuencia_palabras)

def tuplas(frecuencia_palabras):

    palabra_max, frecuencia_max = max(frecuencia_palabras.items(), key=lambda x: x[1])

    print(palabra_max, frecuencia_max)

cadena = input("Introduce una cadena de caracteres: ")

frecuencia = diccionario(cadena)

print("Frecuencia de palabras: ", frecuencia)

maximo = tuplas(frecuencia)

print(f"La palabra más repetida es: {maximo} y su frecuencia es: {frecuencia}")