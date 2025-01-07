elementos = int(input("Cuántos elementos quieres añadir a la lista?: "))
lista = []

for i in range(0, elementos):

    valor = int(input(f"Introduce el valor {i}: "))
    lista.append(valor)

print(lista[::-1])

