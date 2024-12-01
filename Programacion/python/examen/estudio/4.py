texto = str(input("Introduce un string: "))
num = int(input("Introduce un número entero: "))

for i in range(num, len(texto)):

    print(f"{texto[i]}", end="")