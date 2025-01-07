def sum(a,b):
    total = a + b
    print(f"El total de la suma es {total}")

def rest(a,b):
    total = a - b
    print(f"El total de la resta es {total}")

def mult(a,b):
    total = a * b
    print(f"El total de la multiplicación es {total}")

def div(a,b):
    
    try:
        total = a / b
        print(f"El total de la división es {total}")    
    except ValueError:
        print("El primer número debe ser mayor que el segundo")

def tablas(a):

    for i in range(1,11):
        total = a * i
        print(f"{a} x {i} = {total}")
