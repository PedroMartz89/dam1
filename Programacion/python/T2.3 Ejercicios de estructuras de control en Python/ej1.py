num = int(input("Introduce un número entero: "))

if num < 1:
    print("El número introducido no es correcto")

else:
    for i in range (1,num+1):
        print(i)