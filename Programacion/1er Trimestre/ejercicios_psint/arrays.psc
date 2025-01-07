Algoritmo arrays
	Dimension miArray[10]
	Dimension semana[7]
	
	Definir i,edad Como Entero
	Definir media Como Real
	
	semana[1]="Lunes"
	semana[2]="Martes"
	
	para i <- 1 Hasta 10 con paso 1 Hacer
		Escribir "Dime tu edad: "
		leer miArray[i]
	FinPara
	
	edad = 0
	para i <- 1 Hasta 10 con paso 1 Hacer
		Escribir "El elemento de la posición ", i "es: ", miArray[i]
		edad = edad + miArray[i]
	FinPara
FinAlgoritmo
