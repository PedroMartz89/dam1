palabra = str(input("Introduce una palabra: "))

letra_a = palabra.count("a")
letra_e = palabra.count("e")
letra_i = palabra.count("i")
letra_o = palabra.count("o")
letra_u = palabra.count("u")

diccionario = {

    "a" : letra_a,
    "e" : letra_e,
    "i" : letra_i,
    "o" : letra_o,
    "u" : letra_u
}

print(diccionario)