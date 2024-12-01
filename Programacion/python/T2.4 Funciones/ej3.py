import math

def areaCirculo(radio):
    areaTotal = math.pi * (radio * radio)
    return areaTotal

def areaCilindro(altura, radio):
    area_base = areaCirculo(radio)
    area_lateral = 2 * math.pi * radio * altura
    area_total = 2 * area_base + area_lateral
    return area_total

opcion = int(input("Que área quieres calcular? (0 - Círculo   1 - Cilindro): "))

if opcion == 0:
    radio = float(input("Introduce el radio: "))
    print("El área del círculo es:", areaCirculo(radio))

elif opcion == 1:
    radio = float(input("Introduce el radio del cilindro: "))
    altura = float(input("Introduce la altura del cilindro: "))
    print(areaCilindro(altura, radio))
else:
    print("La opción introducida es incorrecta")