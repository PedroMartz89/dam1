num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))
num3 = int(input("Introduce el tercer número: "))

if num1 > num2 and num1 > num3:
    print("El número",num1, "es el mayor")

elif num2 > num1 and num2 > num3:
    print("El número",num2, "es el mayor")

else:
    print("El número",num3, "es el mayor")
