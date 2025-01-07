Algoritmo digitos
	Definir num, digito Como Real
	Escribir "Introduce un número entero: "
	Leer num
	digito <- 0
	si num > 0 Entonces
		
		Repetir
			num = num / 10
			digito = digito + 1
		Hasta Que num <= 1
		Escribir "El numero tiene ", digito, " digitos."
	
	SiNo
		Escribir "Tienes que escribir un numero entero"
	FinSI
FinAlgoritmo
