/*
	Clase Ej3.java
	Escribe una clase java que solicite introducir un número entero y, utilizando estructuras iterativas, reproduzca la siguiente secuencia hasta el número introducido (en el ejemplo, se ha introducido el número 6). (4 puntos):

*
1 *
2 2 *
3 3 3 *
4 4 4 4 *
5 5 5 5 5 *
6 6 6 6 6 6 *
1 2 3 4 5 6 *
1 2 3 4 5 *
1 2 3 4 *
1 2 3 *
1 2 *
1 *
*
	Autor: Pedro Martínez Sánchez
*/

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.print("Introduce un número --> ");
		num = teclado.nextInt();


		for (int i = 1; i < num+1 ; i++ ) {
			System.out.print("*");
			System.out.println();

			for (int j = 0; j < i ; j++) {
				
				
				System.out.printf("%d ", i);
			}
		}


		for (int i = num; i >= 1 ; i-- ) {
			System.out.print("*");
			System.out.println();

			for (int j = 1; j <= i ; j++ ) {
				
				System.out.printf("%d ", j);
			}
		}
		System.out.print("*\n");
	}
}