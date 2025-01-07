def funcion():

    lista = []
    cuadrados = []

    while True:

        valores = input("Introduce los valores de la lista (fin para terminar): ")

        if valores == "fin":
            break
        try:

            lista.append(float(valores))
        except ValueError:

            print("Escribe un número válido")
    
    i = 1

    for i in range (0,len(lista)):

        cuadrado = lista[i] ** 2
        cuadrados.append(cuadrado)

    print("Los cuadrados de los números introducidos son:\n", cuadrados)

funcion()


