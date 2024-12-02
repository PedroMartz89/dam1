
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
	
		int[] array = new int[10];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 10 ; i++ ) {
			
			System.out.printf("Introduce un entero para la posición %d --> ", i);

			array[i] = teclado.nextInt();
		}

		System.out.println();
		System.out.println("Números pares: ");
		System.out.println();

		for (int i = 0;i < array.length ;i++ ) {
			
			if (array[i] % 2 == 0) {
				
				System.out.println("Número " + array[i] + " en la posición " + i );
			}
		}

		System.out.println();
		System.out.println("Números impares: ");
		System.out.println();

		for (int i = 0;i < array.length ;i++ ) {
			
			if (array[i] % 2 != 0) {
				
				System.out.println("Número " + array[i] + " en la posición " + i );
			}
		}

		teclado.close();
	}

}