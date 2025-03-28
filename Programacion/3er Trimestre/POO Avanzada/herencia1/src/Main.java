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


    }
}