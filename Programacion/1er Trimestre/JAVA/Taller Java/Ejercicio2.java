/*

	Clase Ejercicio1
	Escribe una clase java que calcula y escriba la suma y el producto de los 10 primeros números naturales
	28/11/24
	Autor: Pedro Martínez Sánchez

*/

public class Ejercicio2 {

	public static void main(String[] args) {

		int total = 0;

		for (int i = 1; i <= 10 ; i++ ) {
			
			total = total + i;
			
		}
		System.out.println("La suma total es: " + total);

	

		total = 1;

		for (int i = 1; i <= 10 ; i++ ) {
			
			total = total * i;
			
		}
		System.out.println("El producto total es: " + total);

	}

}