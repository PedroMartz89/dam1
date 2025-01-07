def factorial(num):

    if num == 0:
        return 1
    resultado = 1
    
    for i in range(1, num+1):
        resultado *= i
    return resultado

print(factorial(int(input("Introduce un número entero para calcular el factorial: "))))
