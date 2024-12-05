/*
Clase Ej1.java
Escribe un programa simple que, utilizando sólo las instrucciones de salida:
System.out.print("* ");
System.out.print(" ");
System.out.println();
Muestre el siguiente patrón. 
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *

Autor: Pedro Martínez Sánchez

*/

public class Ej1 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 9 ; i++ ) {
			
			if (i % 2 == 0) {
				System.out.println();
				for (int k = 0; k < 9 ; k++ ) {

					System.out.print("* ");
				}
				

			}else {
				System.out.println();
				for (int j = 0; j < 9 ; j++ )

					System.out.print(" *");
			}
		}

	}
}