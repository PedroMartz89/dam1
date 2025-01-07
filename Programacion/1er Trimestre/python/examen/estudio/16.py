num1 = int(input("Introduce el comienzo: "))
fibonacci = [0, 1]

for i in range(2, num1):

    temp = fibonacci[i-1] + fibonacci[i-2]
    fibonacci.append(temp)

print(fibonacci)