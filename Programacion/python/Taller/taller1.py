num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))

if num1 >= 1 and num2 >= 1 and num2 > num1:

    for i in range(num1,num2+1):
        if i % 3 == 0:
            print(i)
else:
    print("Los números no cumplen los requisitos")