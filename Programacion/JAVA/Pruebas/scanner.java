import java.util.Scanner;

public class scanner{

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nombre1;
		String nombre2;
		int edad1;
		int edad2;

		System.out.print("Introduce el nombre de la primera persona: ");
		nombre1 = teclado.nextLine();

		System.out.print("Introduce la edad de la primera persona: ");
		edad1 = teclado.nextInt();

		teclado.nextLine();

		System.out.print("Introduce el nombre de la segunda persona: ");
		nombre2 = teclado.nextLine();

		System.out.print("Introduce la edad de la segunda persona: ");
		edad2 = teclado.nextInt();

		System.out.println("DATOS INTRODUCIDOS");

		System.out.println("Nombre de la primera persona: " + nombre1);
		System.out.println("Edad de la primera persona: " + edad1);

		System.out.println("Nombre de la segunda persona: " + nombre2);
		System.out.println("Edad de la segunda persona: " + edad2);

		teclado.close();
	}
}