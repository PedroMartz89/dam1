/* 

	Array2. java
	
	Introducir 10 enteros por teclado, añadirlos a un array y mostrarlo de forma inversa

	Pedro Martinez Sanchez
	2/12/24
*/

import java.util.Scanner;

public class Array2 {


	public static void main(String[] args) {
		
		int[] array = new int[10];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 10 ; i++ ) {
			
			System.out.printf("Introduce un entero para la posición %d --> ", i);

			array[i] = teclado.nextInt();
		}

		for (int i = 10; i > 0 ; i-- ) {
			
			System.out.printf("\nEl número para la posición %d es --> %d", i-1, array[i-1]);
			System.out.println();
		}
	}
}
