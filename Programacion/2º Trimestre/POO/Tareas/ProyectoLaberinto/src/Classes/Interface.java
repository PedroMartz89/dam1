package Classes;

import java.util.Scanner;

/**
 * Clase que contiene utilidades para usar en el programa.
 * @author Pedro
 * @version 0.1.0
 */

public class Interface {
	public static Scanner keyboard = new Scanner(System.in);

	/**
	 * Metodo para pedir un número entero por teclado.
	 * @return Devuelve el número entero introducido por teclado.
	 */

	public static int getInt() {
		int number = -1;
		String value = keyboard.nextLine();
		try {
			number = Integer.parseInt(value);
		} catch (Exception e) {
			System.err.println("El valor introducido no es un numero");
		}
		return number;
	}

	/**
	 * 
	 * @param text Texto que se muestra al pedir el número.
	 * @return Devuelve el número entero introducido por teclado.
	 */

	public static int getInt(String text) {
		System.out.print(text);
		return getInt();
	}

	/**
	 * 
	 * @return Pide un string y lo devuelve sin espacios sin enunciado.
	 */
	public static String getString() {
		String value = keyboard.nextLine().trim();
		return value;
	}

	/**
	 * 
	 * @param text Texto que se muestra al pedir el string.
	 * @return Devuelve el string introducido por teclado sin espacios.
	 */
	public static String getString(String text) {
		System.out.print(text);
		String value = keyboard.nextLine().trim();
		return value;
	}

	/**
	 * Metodo que crea una pausa con la opción de continuar pulsando enter.
	 */
	public static void toContinue() {
		System.out.print("\nPulse 'enter' para continuar");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}
