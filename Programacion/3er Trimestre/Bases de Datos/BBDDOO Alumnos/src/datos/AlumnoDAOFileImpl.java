package datos;

import dao.Alumno;
import modelo.AlumnoDAOFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoDAOFileImpl implements AlumnoDAOFile {

    @Override
    public ArrayList<Alumno> recuperarFichero() {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        try {

            File fichero = new File("assets/alumnos.txt");
            Scanner rd = new Scanner(fichero);

            while (rd.hasNextLine()) {

                String[] data = rd.nextLine().split("&");
                alumnos.add(new Alumno(data[0], data[1], data[2], data[3], data[4], data[5], data[6]));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return alumnos;
    }
}
