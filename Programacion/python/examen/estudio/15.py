num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el primer número: "))
total = 1
multiplos = []

if num1 < num2 and num1 > 0 and num2 > 0:

    for i in range(num1, num2):

        if i % 3 == 0:
            multiplos.append(i)
        else:
            continue

print(multiplos)