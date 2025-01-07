palabra = input("Introduce una palabra: ")

vocales = {'a':0,'e':0,'i':0,'o':0,'u':0}

for vocal in vocales.keys():
    for letra in palabra:
        if letra==vocal:
            vocales[vocal]+=1

print(vocales)