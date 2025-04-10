import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {

        //cargarDatos();
        recuperarDatos();
        guardarAlumnos();
        System.out.println(listarAlumnos());
    }

    public static void cargarDatos() {

        alumnos.add(new Alumno("Jorge", "Hernandez", "Aparicio", (byte) 18));
        alumnos.add(new Alumno("Roberto", "Company", "Zomeño", (byte) 20));
        alumnos.add(new Alumno("Claudia", "Murcia", "Tomás", (byte) 18));
        alumnos.add(new Alumno("Pedro", "Martinez", "Sanchez", (byte) 18));
    }
    public static void agregarAlumno() {

    }

    public static void guardarAlumnos() {

        try {

            FileOutputStream fAlumnos = new FileOutputStream("alumnos.dat");
            ObjectOutputStream osAlumnos = new ObjectOutputStream(fAlumnos);

            osAlumnos.writeObject(alumnos);

            osAlumnos.flush();
            osAlumnos.close();
            fAlumnos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void recuperarDatos() {
        alumnos.clear();
        try {
            FileInputStream fAlumnos = new FileInputStream("alumnos.dat");
            ObjectInputStream isAlumnos = new ObjectInputStream(fAlumnos);

            alumnos = (ArrayList<Alumno>) isAlumnos.readObject();
            isAlumnos.close();
            fAlumnos.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static String listarAlumnos() {

        StringBuilder lista = new StringBuilder();
        for (Alumno alumno : alumnos) {

            lista.append(alumno.getNombre()).append(" ").append(alumno.getApellido1()).append(" ").append(alumno.getApellido2()).append(" ").append(alumno.getEdad()).append(" \n");
        }

        return lista.toString();
    }

    public static void mostrarAlumno() {

    }

    private static void modificarAlumno() {

    }

    public static void menu() {

        try {

            Scanner sc = new Scanner(System.in);
            int option;

            System.out.println("---- Elige una opcion ----");
            System.out.println("1 -- Crear alumno");
            System.out.println("2 -- Mostrar alumno");
            System.out.println("3 -- Modificar alumno");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    agregarAlumno();
                case 2:
                    mostrarAlumno();

                case 3:
                    modificarAlumno();
            }

        }
    }


}
