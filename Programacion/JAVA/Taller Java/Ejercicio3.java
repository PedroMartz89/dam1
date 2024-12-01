/*

	Clase Ejercicio1
	Escribe un programa simple Java que lea dos números, calcule y muestre el valor de las operaciones de suma, resta, producto y división entre ellos. 
	Autor: Pedro Martínez Sánchez

*/

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int input;


		System.out.print("Introduce un número entero entre 0 y 20: ");

		input = teclado.nextInt();

		if (input >= 0 & input <=20) {
			
			int i = 1;

			for (i = 1; i <= input ; i++ ) {
				
				for (int j = 1; j<=i ; j++ ) {
					
					System.out.print(i);

				}
				
				System.out.println();
			}

		}else {

			System.out.println("El valor introducido no cumple los requisitos.");
		}
	
		teclado.close();
	}

}