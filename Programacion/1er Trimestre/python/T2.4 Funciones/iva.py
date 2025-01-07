def factura(precio,iva=21):
   return precio + precio * impuestos[i] / 100

contador = 1
contador2 = 1
lista = []
impuestos = []
i = 1

while contador == 1:
   cantidad = float(input("Introduce el precio del producto (0 para terminar de introducir datos): "))
   lista.append(cantidad)
   if cantidad == 0:
    while contador2 == 1:
     impuesto = float(input("Introduce el IVA del producto (0 para terminar de introducir datos): "))
     impuestos.append(impuesto)
    if cantidad == 0:
            contador2 = 0
            contador = 0


j = 1

while j < len(lista) + 1:
    total = factura(lista[j],impuestos[j])
    print(f"El descuento aplicado es: {total}€")
    total2 =factura(total)
    print(f"El precio final del producto es: {total2}€")
    j = j + 1


