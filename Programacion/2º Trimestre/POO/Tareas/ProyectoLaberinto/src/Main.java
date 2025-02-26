import Classes.Config;
import Classes.Interface;
import Classes.Session;
import java.util.Scanner;

/**
 *
 * Programa principal del sistema para resolver un laberinto
 * @author Pedro
 * @version 0.1.0
 */

public class Main {
    public static void main(String[] args) {

        Config config = new Config();
        Session session = new Session();
        Scanner input = new Scanner(System.in);
        int option;
        boolean execute = true;

        System.out.println(config.getWELCOME());
        System.out.println("Versión del proyecto: " + config.getVERSION());

        while (execute){
            System.out.println(config.getUNLOGGED_MENU());
            System.out.print("Elige una opción: ");
            option = input.nextInt();


            if (option == 1) {

                boolean logged = session.login();

                if (logged) {

                    System.out.println("Login correcto");
                    System.out.println();
                    while (logged) {
                        System.out.println(config.getLOGGED_MENU());
                        System.out.print("Introduce una opción: ");
                        option = input.nextInt();

                        if (option == 1) {

                            System.out.println("Proximamente");

                        } else if (option == 2) {

                            System.out.println("Proximamente");

                        } else if (option == 3) {

                            System.out.println("Proximamente");

                        } else if (option == 4) {

                            System.out.println("Proximamente");

                        } else if (option == 5) {

                            session.showUser();
                            Interface.toContinue();

                        } else if (option == 6) {

                            session.logout();

                            System.out.println("Sesión cerrada correctamente.");
                            System.out.println();
                            logged = false;

                        } else if (option == 0) {

                            System.out.println("Saliendo del programa");
                            System.out.println(config.getGOODBYE());
                            System.exit(0);
                        }


                    }

                } else {

                    System.out.println("Login incorrecto");

                }

            } else if (option == 2) {
                String user, passwd, name, nif, email, address, birthday;
                input.nextLine();

                System.out.println("Iniciando registro");

                System.out.print("Introduce un nombre de usuario: ");
                user = input.nextLine();

                System.out.print("Introduce una contraseña: ");
                passwd = input.nextLine();

                System.out.print("Introduce tu nombre: ");
                name = input.nextLine();

                System.out.print("Introduce tu nif: ");
                nif = input.nextLine();

                System.out.print("Introduce tu email: ");
                email = input.nextLine();

                System.out.print("Introduce tu dirección: ");
                address = input.nextLine();

                System.out.print("Introduce tu fecha de nacimiento: ");
                birthday = input.nextLine();

                session.signup(user, passwd, name, nif, email, address, birthday);

                System.out.println("Registro completo.");

            } else if (option == 0) {

                System.out.println(config.getGOODBYE());
                execute = false;

            } else {

                System.out.println("La opción elegida es inválida");
                System.out.println();

            }

        }
    } }

