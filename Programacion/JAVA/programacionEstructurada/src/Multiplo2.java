	// Multiplo1.java
	// Fecha: 14/10/2013
	// Autor/a:.......
	// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

import java.util.Scanner;
	public class Multiplo2 	{
		public static void main(String argumentos[]) {

			// Declaración de variables
			Scanner teclado = new Scanner(System.in);
			final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
			mostrarMultiplo2(TOPE);
			mostrarMultiplo2(40);
			teclado.close();
			
		}

		public static void mostrarMultiplo2(int tope) {
			int mult  ;							// Almacena el múltiplo calculado
			int cont  ;							// Contador utilizado en el cálculo

			// Inicializa las variables
			mult = 0 ;
			cont = 0 ;
			System.out.println("\t Múltiplos de 2\n");
			while (mult < tope)					// Bucle de cálculo y visualización
			{
				mult = cont * 2;
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;
			}
			
			
		}



	}