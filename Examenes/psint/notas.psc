Algoritmo notas
	
	Definir nota1, nota2 Como Real
	
	Escribir "Introduce la nota de Programación: "
	Leer nota1
	
	Escribir "Introduce la nota de Bases de datos: "
	Leer nota2
	
	si nota1 <= 10 y nota1 >= 0 y nota2 <= 10 y nota2 >= 0 Entonces
		
		si nota1 < 5 Entonces
			Escribir "La nota de programación es de insuficiente"
		FinSi
		
		si nota1 >= 5 y nota1 < 6
			Escribir "La nota de programación es de suficiente"
		FinSi
		
		si nota1 >= 6 y nota1 < 7
			Escribir "La nota de programación es de bien"
		FinSi
		
		si nota1  >= 7 y nota1 < 8.5
			Escribir "La nota de programación es de notable"
		FinSi
		
		si nota1 >= 8.5 y nota1 < 10
			Escribir "La nota de programación es de sobresaliente"
		FinSi
		
		si nota1 = 10 
			Escribir "La nota de programación es de matrícula de honor"
		FinSi
		
		
		si nota2 < 5 Entonces
			Escribir "La nota de programación es de insuficiente"
		FinSi
		
		si nota2 >= 5 y nota2 < 6
			Escribir "La nota de programación es de suficiente"
		FinSi
		
		si nota2 >= 6 y nota2 < 7
			Escribir "La nota de programación es de bien"
		FinSi
		
		si nota2 >= 7 y nota2 < 8.5
			Escribir "La nota de programación es de notable"
		FinSi
		
		si nota2 >= 8.5 y nota2 < 10
			Escribir "La nota de programación es de sobresaliente"
		FinSi
		
		si nota2 = 10 
			Escribir "La nota de programación es de matrícula de honor"
		FinSi
		
	SiNo
		Escribir "Debes introducir dos números reales"
	FinSi
FinAlgoritmo
