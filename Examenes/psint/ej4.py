cadena="1"
print(cadena)


for i in range(2,7):
    
    i = str(i)
    cadena = cadena + i
    print(cadena)

contador = 5
palabras = 5
total = 5
contador2 = 5
while contador >= 1:

    while palabras >= 1 and contador >= 1:

        print(str(palabras), end="")
        contador = contador -1
        
    print("")
    contador2 = contador2 -1
    contador = contador2
    palabras = palabras - 1
