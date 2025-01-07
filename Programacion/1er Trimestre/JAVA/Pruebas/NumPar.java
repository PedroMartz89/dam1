/*
	Clase NumPar
	Escribe un programa simple Java que lea un número e indique si es par o no.
	21/11/2024
*/

import java.util.Scanner;

public class NumPar {

	public static void main (String[] Args) {

		Scanner teclado = new Scanner(System.in);

		String input1;
		int num1;

		System.out.print("Introduce el primer número: ");
		input1 = teclado.nextLine();
		num1 = Integer.parseInt(input1);


		if (num1 % 2 == 0) {

			System.out.println("El número " + num1 + " es par");
		
		}else{

			System.out.println("El número " + num1 + " no es par");

		}
	}
}