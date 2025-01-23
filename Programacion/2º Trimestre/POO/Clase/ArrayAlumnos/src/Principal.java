import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int numAlumnos = 0;
        String nombre = "";
        String apellido = "";
        int nre;
        String email = "";
        String dir = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de alumnos a crear: ");
        numAlumnos = teclado.nextInt();

        Alumno[] arrayAlumnos = new Alumno[numAlumnos];
        teclado.nextLine();

        for (int i = 0; i < arrayAlumnos.length; i++) {

            System.out.println("Nombre del alumno "+ i + ":");
            nombre = teclado.nextLine();

            System.out.println("Apellidos del alumno "+ i + ":");
            apellido = teclado.nextLine();

            System.out.println("NRE del alumno "+ i + ":");
            nre = teclado.nextInt();

            teclado.nextLine();
            System.out.println("Email del alumno "+ i + ":");
            email = teclado.nextLine();

            System.out.println("Dirección del alumno "+ i + ":");
            dir = teclado.nextLine();

            arrayAlumnos[i] = new Alumno(nombre,apellido,nre,email,dir);
        }

        System.out.println("De qué alumno quieres ver a información?: ");
        System.out.println("0 - Salir");

        for (int i = 0; i < arrayAlumnos.length; i++) {

            System.out.println(i+1 +" - " + arrayAlumnos[i].getNombre());

        }


        while (true) {

            int eleccion = teclado.nextInt();

            if (eleccion == 0) {

                System.out.println("Se va a salir del programa");
                break;

            } else if (eleccion > 0 && eleccion <= arrayAlumnos.length) {

                System.out.println(arrayAlumnos[eleccion-1].info());
            } else {

                System.out.println("Ese alumno no existe en el programa.");
            }
        }

        teclado.close();
    }

    }
