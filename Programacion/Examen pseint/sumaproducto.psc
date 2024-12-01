Algoritmo sumaproducto	
	
	Definir i, temp, suma, producto Como Entero
	Dimension myArray[10]
	temp = 0
	
	para i = 1 hasta 10 con paso 1 hacer 
		Escribir "Introduce un valor: "
		Leer myArray[i]
	FinPara
	
	para i = 1 hasta 10 con paso 1 Hacer
		
		temp = myArray[i] + temp
		Escribir temp
	FinPara
	
	Escribir "-------------------------------------"
	suma = temp
	temp = 1
	para i = 1 hasta 10 con paso 1 Hacer
		
		temp = myArray[i] * temp
		Escribir temp
	FinPara
	
	producto = temp
	
	Escribir "La suma de los valores es ", suma, " y el producto de ellos es ", producto
	
FinAlgoritmo
