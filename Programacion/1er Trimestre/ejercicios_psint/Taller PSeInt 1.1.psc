Algoritmo bucle
	Repetir
		contador=1;
		
		Escribir "Ingresa un número entre 1 y 7: "
		Leer num;
		
		Si num = 1 Entonces
			Escribir "El día de la semana es Lunes"
			contador = contador + 1;
		SiNo
			Si num = 2 Entonces
				Escribir "El dia de la semana es Martes"
				contador = contador + 1;
			SiNo
				Si num = 3 Entonces
					Escribir "El día de la semana es Miercoles"
					contador = contador + 1;
				SiNo
					Si num = 4 Entonces
						Escribir "El dia de la semana es Jueves"
						contador = contador + 1;
					SiNo
						Si num = 5 Entonces
							Escribir "EL dia de la semana es Viernes"
							contador = contador +1;
						SiNo
							Si num = 6 Entonces
								Escribir "El dia de la semana es Sábado"
								contador = contador + 1;
							SiNo
								Si num = 7 Entonces
									Escribir "El dia de la semana es Domingo"
									contador = contador + 1;
								SiNo
									Escribir "La opcion no es válida, vuelve a intentarlo"
								Fin Si
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Hasta Que contador <> 1;
	
FinAlgoritmo
