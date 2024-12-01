print("Inicio de programa");

numeros = [] #creamos una lista
for i in range(0, 10): #con un bucle añadimos los valores a la lista
    num = int(input("Introduce un número: "))
    numeros.append(num) #esta linea añade el valor

mayor = max(numeros) #buscamos el valor mayor de la lista
menor = min(numeros) #aqui buscamos el menor

#pasamos por pantalla los dos valores

print(f"El número mayor es: {mayor}")
print(f"El número menor es: {menor}")