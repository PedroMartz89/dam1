/*
	Clase Ej2.java
	Escribe una clase java que solicite una cantidad de euros (múltiplo de 5) y realice el desglose de billetes (500, 200, 100, 50, 20, 10, 5) intentando siempre dar el mínimo de billetes posible. (3,5 puntos).
	Autor: Pedro Martínez Sánchez
*/

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int euros, billetes=1;
		boolean condicion = false;

		while (!condicion) {
			
			System.out.print("Introduce una cantidad de euros (múltiplo de 5)--> ");
			euros = teclado.nextInt();

			if (euros % 5 == 0) {
				condicion = true;
				billetes = euros;
				
				for (int i = 5; i <= 20 ; i = i + i ) {

					billetes = euros / i;
					System.out.printf("La cantidad de billetes de %d es %d\n", i, billetes);
					
				}
						
				for (int i = 50; i <= 200 ; i = i + i ) {

					billetes = euros / i;
					System.out.printf("La cantidad de billetes de %d es %d\n", i, billetes);
					
				}

				billetes = euros / 500;
				System.out.printf("La cantidad de billetes de 500 es %d\n", billetes);

			} else {

				System.out.println("El valor introducido no cumple los requisitos ");
				
			}
		}
		

	}
}