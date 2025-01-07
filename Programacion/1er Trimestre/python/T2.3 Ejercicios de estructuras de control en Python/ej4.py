num=int(input("Que tabla quieres imprimir?: "))

if num > 0:
    print("La tabla del",num, "es:")
    for i in range(0,10):
        total = num * i
        print(num,"x", i, "=", total)

else:
    print("Introduce un número mayor que 0")