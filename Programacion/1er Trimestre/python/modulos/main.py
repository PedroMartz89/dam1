import mates as m

print("1 - Calculadora")
print("2 - Tablas")
print("3 - MCD")
print("4 - MCM")
opcion = input("Como quieres usar el programa?: ")

if opcion == "1":
    print("Qué operación deseas realizar?: ")
    operacion = input("Suma (+), resta (-), multiplicar (x), dividir (/): ")

    if operacion == "+":
       a = int(input("Introduce el primer número: "))
       b = int(input("Introduce el segundo número: "))

       m.sum(a,b)

    elif operacion == "-":
       a = int(input("Introduce el primer número: "))
       b = int(input("Introduce el segundo número: "))

       m.rest(a,b)
    
    elif operacion.lower == "x":
       a = int(input("Introduce el primer número: "))
       b = int(input("Introduce el segundo número: "))

       m.mult(a,b)
    
    elif operacion == "/":
       a = int(input("Introduce el primer número: "))
       b = int(input("Introduce el segundo número: "))

       m.div(a,b)
    else:
       print("La opción introducida no es correcta")

elif opcion == "2":
    try:
        a = int(input("Introduce el número para saber su tabla de multiplicar: "))
        m.tablas(a)
        
    except ValueError:
       print("El valor introducido no es válido")
else:
    print("El numero no es correcto")