Algoritmo tablas2
	
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir contador Como Entero
	Definir contador2 Como Entero
	Definir producto Como Entero
	
	Escribir "Introduce dos números enteros: "
	
	Leer num1
	Leer num2
	
	si num1 > 0 y num2 > num1 Entonces
		
		para contador2 <- num1 Hasta num2 Con Paso 1 Hacer
			
			Escribir "TABLA DE MULTIPLICAR DEL ", contador2;
			
			Para contador <- 1 Hasta 10 Con paso 1 Hacer
				producto = contador * contador2
				Escribir contador, " x ", contador2, " = ", producto
			Fin Para
			
		FinPara
		
	SiNo
		
		Escribir "Escribe un numero mayor que 0"
		
	FinSi
	
FinAlgoritmo
