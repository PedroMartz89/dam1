
precio = float(input("Introduce el precio del producto: "))
    
descuento = float(input("Introduce el porcentaje de descuento (sin el %): "))

if precio > 0 and 0 <= descuento <= 100:

    monto_descuento = precio * (descuento / 100)
        

    precio_final = precio - monto_descuento
        
    print(f"El descuento aplicado es: {monto_descuento:.2f} €")
    print(f"El precio final del producto es: {precio_final:.2f} €")
else:
 print("Error: El precio debe ser mayor que 0 y el descuento debe estar entre 0 y 100.")

