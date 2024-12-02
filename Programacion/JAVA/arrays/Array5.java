
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
	
		
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Introduce un string: ");
		String palabra = teclado.nextLine();

		char[] array = new char[palabra.length()];
		

		for (int i = 0; i < palabra.length() ; i++ ) {
			
			array[i] = palabra.charAt(i);
			System.out.println(array[i]);
		}

		System.out.println("La longitud de la palabra es: " + palabra.length());

	}

}