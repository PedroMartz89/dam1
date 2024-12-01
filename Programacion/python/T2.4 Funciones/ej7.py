import math

def mcdivisor(a,b):

    mcd = math.gcd(a,b)
    print(f"El MCD de {a} y {b} es: {mcd}")


def mcmultiplo(a,b):

    mcm = math.lcm(a,b)
    print(f"El MCM de {a} y {b} es: {mcm}")

a = int(input("Introduce el primer número: "))
b = int(input("Introduce el segundo número: "))

mcdivisor(a,b)
mcmultiplo(a,b)