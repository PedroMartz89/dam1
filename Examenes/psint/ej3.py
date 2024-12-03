def tablas(a,b):

    if a > 0 and b > 0 and b > a:
            
        print(f"La tabla de multiplicar del {a}, desde el 10 hasta el 1, es: ")
        ("------------------------------------------------------------------")

        for i in range (10, 0, -1):

            producto = a * i

            print(f"{a} x {i} = {producto}")
        
        print(f"La tabla de multiplicar del {a}, desde el 10 hasta el 1, es: ")
        print("------------------------------------------------------------------")

        for j in range (10, 0, -1):

            producto2 = b * j

            print(f"{b} x {i} = {producto2}")


while True:
    
    a = int(input("Introduce el primer valor: "))
    b = int(input("Introduce el segundo valor: "))

    if a > 0 and b > 0 and b > a:
        tablas(a,b)
        break
    else:
        print("Los valores introducidos no son válidos, vuelva a intentarlo") 





