Algoritmo multiplos
	
	Definir num1, num2, i como entero
	
	Escribir "Introduce dos n�meros enteros entre 0 y 100"
	Leer num1
	Leer num2
	
	si num2 > num1 Entonces
		para i = num1 Hasta num2 con paso 1 Hacer
			
			si i mod 3 = 0 y i mod 5 = 0
				Escribir "El n�mero ", i, " es m�ltiplo de 3 y 5"
			FinSi
			
		FinPara
	SiNo
		Escribir "El primer n�mero debe ser menor que el segundo"
	FinSi
	
	
	
FinAlgoritmo
