/*

	Clase Ejercicio1
	Escribe una clase java que lea dos números y nos dice cuál de ellos es mayor o si son iguales
	28/11/24
	Autor: Pedro Martínez Sánchez

*/

import java.util.Scanner;

public class Ejercicio1 {


	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);

		int num1, num2;

		System.out.print("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el primer número: ");
		num2 = teclado.nextInt();

		if (num1 > num2) {
			
			System.out.println("El número " + num1 + " es el mayor");
		
		}
		else {

			if (num2 > num1) {
				
				System.out.println("El número " + num2 + " es el mayor");

			} else{


				System.out.println("Los dos números son iguales");
			}

		}
		
		teclado.close();
	}
}