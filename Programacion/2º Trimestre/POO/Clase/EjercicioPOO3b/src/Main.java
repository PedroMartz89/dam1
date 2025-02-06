import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Modulo> listaModulos = new ArrayList<>();

        try {
            File texto = new File("assets/files/modulos.txt");
            Scanner lectura = new Scanner(texto);

            while (lectura.hasNextLine()) {

                String info = lectura.nextLine();
                String[] array1 = info.split("&");


                listaModulos.add(new Modulo(Integer.parseInt(array1[0]),array1[1], Integer.parseInt(array1[2]), Integer.parseInt(array1[3]), array1[4], buscarAlumnosEnModulo(Integer.parseInt(array1[0]))));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        imprimirListaModulos(listaModulos);
    }

    public static void imprimirListaModulos(ArrayList<Modulo> listaModulos) {

        for (Modulo listaModulo : listaModulos) {

            System.out.println(listaModulo.toString());

            System.out.println("\tAlumnos en módulo: ");

            for (int j = 0; j < listaModulo.getArrayAlumnos().size(); j++) {

                Alumno alumnoActual = listaModulo.getArrayAlumnos().get(j);

                System.out.println("\t" + alumnoActual.toString());
            }
        }

    }

    public static ArrayList<Alumno> buscarAlumnosEnModulo(int modulo) {
        ArrayList<Alumno> alumnoEnModulo = new ArrayList<>();
        try {
            File texto = new File("assets/files/modulo_alumno.txt");
            Scanner lectura = new Scanner(texto);

            while (lectura.hasNextLine()) {

                String data = lectura.nextLine();
                String[] linea = data.split(",");

                if (Integer.parseInt(linea[0]) == modulo) {

                    Alumno alumnoActual = recuperarAlumno(Integer.parseInt(linea[1]));
                    alumnoEnModulo.add(alumnoActual);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return alumnoEnModulo;
    }

    public static Alumno recuperarAlumno(int idAlumno) {

        Alumno alumnoActual = null;
        try {
            File texto = new File("assets/files/alumnos.txt");
            Scanner lectura = new Scanner(texto);

            while (lectura.hasNextLine()) {

                String data = lectura.nextLine();
                String[] listaAlumnos = data.split("&");

                if (Integer.parseInt(listaAlumnos[0]) == idAlumno) {

                    alumnoActual = new Alumno(Integer.parseInt(listaAlumnos[0]),
                            listaAlumnos[1],
                            listaAlumnos[2],
                            listaAlumnos[3],
                            listaAlumnos[4],
                            listaAlumnos[5],
                            Integer.parseInt(listaAlumnos[6]));

                }
            }

            lectura.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return alumnoActual;
    }
}