Algoritmo promedio
	
	suma = 0
	Escribir "Escribe la cantidad de n�meros que quieres calcular"
	Leer n;
	
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese un n�mero: "
		Leer num
		suma = num + suma
	Fin Para
	
	media = suma / n;
	
	Escribir "El promedio es ", media;
FinAlgoritmo
