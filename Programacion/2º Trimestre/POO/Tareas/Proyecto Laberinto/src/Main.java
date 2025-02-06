import Classes.Config;
import Classes.Session;

import java.util.Scanner;

/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DMS - 2021.11.27
 * version 0.1.0
 */

public class Main {
	public static void main(String[] args) {

		Config config = new Config();
		Session session = new Session();
		Scanner input = new Scanner(System.in);
		int option;

		System.out.println(config.getWELCOME());
		System.out.println(config.getUNLOGGED_MENU());
		option = input.nextInt();


		if (option == 1) {

			boolean logged = session.login();

			if (logged) {

				System.out.println("Login correcto");



			}else {

				System.out.println("Login incorrecto");

			}
		} else if (option == 2) {
			String user,passwd,name,nif,email,address,birthday;
			input.nextLine();

			System.out.println("Iniciando registro");

			System.out.print("Introduce un nombre de usuario: ");
			user= input.nextLine();

			System.out.print("Introduce una contraseña: ");
			passwd= input.nextLine();

			System.out.print("Introduce tu nombre: ");
			name= input.nextLine();

			System.out.print("Introduce tu nif: ");
			nif= input.nextLine();

			System.out.print("Introduce tu email: ");
			email= input.nextLine();

			System.out.print("Introduce tu dirección: ");
			address= input.nextLine();

			System.out.print("Introduce tu fecha de nacimiento: ");
			birthday= input.nextLine();

			session.signup(user,passwd,name,nif,email,address,birthday);

			System.out.println("Registro completo.");
		} else if (option == 0) {

		}

	}
}