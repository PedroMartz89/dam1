def funcion(num):

    binario = ""
    while num > 0:

        resto = num % 2
        binario = str(resto)+ binario 
        num = num // 2 

    print(binario)

funcion(int(input("Introduce un número entero: ")))