

/*
Clase Mayor

	Escribe un programa simple Java que lea dos números y que escriba el mayor de los dos

*/

import java.util.Scanner;
import java.lang.Math;

public class Mayor{

	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);

		String input1;
		String input2;
		Integer num1, num2;

		System.out.print("Introduce el primer número: ");
		input1 = teclado.nextLine();
		num1 = Integer.parseInt(input1);

		System.out.print("Introduce el segundo número: ");
		input2 = teclado.nextLine();
		num2 = Integer.parseInt(input2);

		System.out.println("El número mayor es: " + Math.max(num1,num2));
	}


}