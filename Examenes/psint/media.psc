Algoritmo arrays
	
	Dimension array[10]
	
	Definir i, temp1, temp2 Como Entero

	temp1=0
	temp2=1
	
	para i = 1 hasta 10 con paso 1 Hacer
		
		Escribir "Introduce un valor: "
		Leer array[i]
		
	FinPara
	
	para i = 1 hasta 10 con paso 1 Hacer
		
		si array[i] < 0 Entonces
			
			Escribir "El número en la posición", i, "es negativo"
			
		FinSi
		
		si array[i] >= 0 Entonces
			
			Escribir "El número en la posición", i, "es positivo"
			
		FinSi 
		
		para i = 1 hasta 10 con paso 1 Hacer
			
			si array[i] > temp1 Entonces
				
				temp1 = array[i]
				temp2 = i
				
			FinSi
			
		FinPara
		
		Escribir "El máximo es ", temp1, " en la posición ", temp2
		temp1 = 1
		temp2 = 1
		para i = 1 hasta 10 con paso 1 Hacer
			
			si array[i] < temp1 Entonces
				
				temp1 = array[i]
				temp2 = i
				
			FinSi
			
		FinPara
		
		Escribir "El mínimo es ", temp1, " en la posición ", temp2
		
		temp1 = 0
		temp2 = 0
		para i = 1 hasta 10 con paso 1 Hacer
			
			temp1 = temp1 + array[i]
			media = temp1
			
		FinPara
		
		media = media/10
		
		Escribir "La media es ", media
		
		
	FinPara
FinAlgoritmo
