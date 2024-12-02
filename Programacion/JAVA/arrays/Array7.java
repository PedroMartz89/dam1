
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		double[] array = new double[5];

		for (int i = 0; i < array.length ; i++ ) {
			
			System.out.printf("Introduce la altura de las personas: ");

			array[i] = teclado.nextDouble();

		}

		double media = 0;

		for (int i = 0; i < array.length ; i++ ) {
			

			media = media + array[i];

		}

		media = media / array.length;

		for (int i = 0; i < array.length ; i++ ) {
			
			if (array[i] < media) {
				
				System.out.printf("\nLa persona en la posición %d del array, está por debajo de la media", i);
			
			}else {

				System.out.printf("\nLa persona en la posición %d del array, está por encima de la media", i);
			}

		}
		
		System.out.println();

	}

}