import Classes.Config;
import Classes.Interface;
import Classes.Maze;
import Classes.Session;
import java.util.Scanner;

/**
 * Programa principal del sistema para resolver un laberinto
 * @author Pedro
 * @version 0.1.0
 */

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        Session session = new Session();
        Scanner input = new Scanner(System.in);
        Interface iface = new Interface();
        Maze maze = new Maze();
        boolean execute = true;

        System.out.println(config.getWELCOME());
        System.out.println("Versión del proyecto: " + config.getVERSION());

        while (execute) {
            System.out.println(config.getUNLOGGED_MENU());
            System.out.print("Elige una opción: ");

            int option = iface.getInt("Elige una opción: ");

            switch (option) {
                case 1 -> usageLoginMenu(session, config, iface, maze);
                case 2 -> handleSignup(session, input);
                case 0 -> {
                    System.out.println(config.getGOODBYE());
                    execute = false;
                }
                default -> System.out.println("La opción elegida es inválida\n");
            }
        }
        input.close();
    }

    private static void usageLoginMenu(Session session, Config config, Interface iface, Maze maze) {
        if (session.login()) {
            System.out.println("Login correcto\n");
            boolean logged = true;

            while (logged) {
                System.out.println(config.getLOGGED_MENU());
                int option = iface.getInt("Introduce una opción: ");

                switch (option) {
                    case 1 -> maze.loadMaze();
                    case 2 -> maze.showMaze(iface);
                    case 3 -> maze.setEntranceExit(iface);
                    case 4 -> System.out.println("Proximamente");
                    case 5 -> {
                        session.showUser();
                        iface.toContinue();
                    }
                    case 6 -> {
                        session.logout();
                        System.out.println("Sesión cerrada correctamente.\n");
                        logged = false;
                    }
                    case 0 -> {
                        System.out.println("Saliendo del programa");
                        System.out.println(config.getGOODBYE());
                        System.exit(0);
                    }
                    default -> System.out.println("Opción inválida\n");
                }
            }
        } else {
            System.out.println("Login incorrecto");
        }
    }

    private static void handleSignup(Session session, Scanner input) {

        System.out.println("Iniciando registro");

        System.out.print("Introduce un nombre de usuario: ");
        String user = input.nextLine();

        System.out.print("Introduce una contraseña: ");
        String passwd = input.nextLine();

        System.out.print("Introduce tu nombre: ");
        String name = input.nextLine();

        System.out.print("Introduce tu NIF: ");
        String nif = input.nextLine();

        System.out.print("Introduce tu email: ");
        String email = input.nextLine();

        System.out.print("Introduce tu dirección: ");
        String address = input.nextLine();

        System.out.print("Introduce tu fecha de nacimiento: ");
        String birthday = input.nextLine();

        session.signup(user, passwd, name, nif, email, address, birthday);
        System.out.println("Registro completo.");
    }

}
