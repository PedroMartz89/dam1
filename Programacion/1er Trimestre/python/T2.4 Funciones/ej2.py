def factura(precio, porcentaje_iva=21):

    opcion = float(input("Que IVA quieres aplicar? (0 para defecto): "))

    if opcion == 0:
        iva = (precio * porcentaje_iva) / 100
    else:
        iva = (precio * opcion) / 100

    total = precio + iva
    return total
print(factura(float(input("Introduce el total de la factura: "))))