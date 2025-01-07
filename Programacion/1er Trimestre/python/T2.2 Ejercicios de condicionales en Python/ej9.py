try:
    peso = float(input("Introduce tu peso en kilogramos: "))
    
    altura = float(input("Introduce tu altura en metros: "))

    if peso > 0 and altura > 0:

        imc = peso / (altura ** 2)
        print(f"Tu IMC es: {imc:.2f}")


        if imc < 18.5:
            print("Clasificación: Bajo peso")
        elif 18.5 <= imc < 24.9:
            print("Clasificación: Peso normal")
        elif 25 <= imc < 29.9:
            print("Clasificación: Sobrepeso")
        else:
            print("Clasificación: Obesidad")
    else:
        print("Error: El peso y la altura deben ser valores positivos.")

except ValueError:
    print("Error: Entrada inválida. Por favor, introduce valores numéricos para peso y altura.")
