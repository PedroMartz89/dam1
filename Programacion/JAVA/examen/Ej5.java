/*
	Clase Ej5.java
	Escribe una clase java que calcula y escriba la suma y el producto de los 10 primeros números naturales.
	Autor: Pedro Martínez Sánchez

*/

public class Ej5 {

	public static void main(String[] args) {
		
		int temp = 0;

		for (int i = 1; i < 11 ; i++ ) {
			
			temp = temp + i;

			System.out.println(temp);
		}

		System.out.println();
		temp = 1;

		for (int i = 1; i < 11 ; i++ ) {
			
			temp = temp * i;

			System.out.println(temp);
		}
	}
}