
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int[] array = new int[10];
		int mayor=0, menor=0;

		for (int i = 0; i < 10 ; i++ ) {
			
			System.out.print("Introduce un valor: ");
			array[i] = teclado.nextInt();
		}

		mayor = array[0];
		menor = array[0];

		for (int j = 0; j < 10 ; j ++) {
			
			if (array[j] > mayor) {
				
				mayor = array[j];				
			}


			if (array[j] < menor) {
				
				menor = array[j];				
			}


		}
		System.out.println(mayor);
		System.out.println(menor);
	}
}