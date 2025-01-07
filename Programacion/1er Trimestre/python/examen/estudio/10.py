precio = int(input("Introduce el precio del producto: "))

if precio <= 500:

    total = precio
    print(f"El total con IVA de {precio} es {total}€ ")

elif precio > 500  and precio <= 2000:

    impuesto = 10 * precio / 100
    total = precio + impuesto
    print(f"El total con IVA de {precio} es {total}€ ")

else:

    impuesto = 21 * precio / 100
    total = precio + impuesto
    print(f"El total con IVA de {precio} es {total}€ ")



