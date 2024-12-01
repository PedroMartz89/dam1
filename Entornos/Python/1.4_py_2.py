
#definimos una funcion con el programa principal
def programa():

    print("Inicio de programa");
    
    numeros = []
    for i in range(0, 10):
        num = int(input("Introduce un número: "))
        numeros.append(num)
    
    numeros.sort()
    mayor = max(numeros)
    menor = min(numeros)
    
    print(f"El número menor es: {menor}")
    print(f"El número mayor es: {mayor}")

#hacemos un bucle para poder despues elegir si reiniciar el programa
while True:
    #mientras el bucle sea verdadero, se ejecutara el programa
    programa()

    #aqui preguntaremos sobre volver a iniciar el programa, si es 1 sera true y se repetira, si es 2 saldra del programa, si es otro valor diferente, volverá a preguntar hasta que le pasemos un valor correcto
    while True:
        opcion = input("Quiere volver a ejecutar el programa? 1- Si 2- No : ")

        if opcion == "1":
            programa()
        elif opcion == "2":
            print("Saliste del programa")
            exit()
        else:
            print("Parámetro incorrecto, vuelve a intentarlo")