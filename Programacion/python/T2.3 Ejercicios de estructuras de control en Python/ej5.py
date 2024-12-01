num1=int(input("Introduce el primer número: "))
num2=int(input("Introduce el segundo número: "))
contador2=num1
contador1 = 0

if num1 > 0 and num2 > 0:

    for contador2 in range(num1,num2+1):
        print("TABLA DE MULTIPLICAR DEL ", contador2)
        for contador1 in range(0,11):
            total = contador1 * contador2
            print(contador1, " x ", contador2, " = ", total) 
       
else:
    print("Introduce un número mayor que 0")