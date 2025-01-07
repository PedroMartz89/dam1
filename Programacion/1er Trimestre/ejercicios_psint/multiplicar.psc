Algoritmo tablas
	Definir num Como Entero
	Definir contador Como Entero
	Definir producto Como Entero
	Escribir "Introduce un número entero: "
	Leer num
	
	si num > 0 Entonces
		
		Para contador <- 1 Hasta 10 Con paso 1 Hacer
			producto = contador * num
			Escribir contador, " x ", num, " = ", producto
		Fin Para
	SiNo
		Escribir "Escribe un numero mayor que 0"
	FinSi
	
FinAlgoritmo
