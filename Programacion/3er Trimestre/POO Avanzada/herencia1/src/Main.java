import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Pedro", "Martinez", 10);
        Trabajador trab1 = new Trabajador("Jorge", "Hernandez", 10, 30 );

        System.out.println(est1);
        System.out.println(trab1);
        System.out.println("ORDENACIÓN CON COMPARABLE");

        ArrayList<Estudiante> array = new ArrayList<>();
        array.add(new Estudiante("Pedro", "Martinez", 8));
        array.add(new Estudiante("Claudia", "Murcia", 10));
        array.add(new Estudiante("Jorge", "Hernández", 5.1));
        array.add(new Estudiante("Roberto", "Botín", 8.5));
        array.add(new Estudiante("Paloma", "Gombau?", 8.5));
        array.add(new Estudiante("Alberto", "Martinez", 7.8));
        array.add(new Estudiante("Juan David", "Hernández", 6.9));

        Collections.sort(array);

        for (Estudiante estudiante : array) {

            System.out.println(estudiante);
        }

        ArrayList<Trabajador> array2 = new ArrayList<>();
        array2.add(new Trabajador("Pedro", "Martinez", 1900, 8));
        array2.add(new Trabajador("Jorge", "Hernandez", 1200, 5));
        array2.add(new Trabajador("Claudia", "Murcia", 1800, 7));
        array2.add(new Trabajador("Roberto", "Company", 1600, 8));

        System.out.println("TRABAJADORES SIN ORDENAR");
        for (Trabajador trabajador : array2) {

            System.out.println(trabajador);
        }

        Collections.sort(array2);
        System.out.println("TRABAJADORES ORDENADOS");
        for (Trabajador trabajador : array2) {

            System.out.println(trabajador);
        }
    }
}