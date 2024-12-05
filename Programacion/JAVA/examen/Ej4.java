/*

	Clase Ej4.java

	 Escribe una clase java que lee dos números y nos dice cuál de ellos es mayor o si son iguales.

	 Autor: Pedro Martínez Sánchez
*/

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
	
		int num1, num2;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer número --> ");
		num1 = teclado.nextInt();

		System.out.print("Introduce el segundo número --> ");
		num2 = teclado.nextInt();

		if (num1 < num2) {

			System.out.printf("El número %d es mayor que el numero %d.", num2, num1);
			
		} else {

			if (num1 > num2) {

			System.out.printf("El número %d es mayor que el numero %d.", num1, num2);

			} else {

				System.out.printf("Los dos números son iguales");
			}


		}
	}
}