package data;

import dao.PersonaDAO;
import dao.PersonaDAOFile;
import model.Persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaDAOFileImpl implements PersonaDAOFile {

    @Override
    public ArrayList<Persona> recuperarFile() {

        ArrayList<Persona> personas = new ArrayList<>();

        try {

            File file = new File("src/assets/alumnos.txt");
            Scanner rd = new Scanner(file);

            while (rd.hasNextLine()) {

                String[] data = rd.nextLine().split("&");

                personas.add(new Persona(data[0], data[1], data[2], data[3], data[4], data[5], data[6]));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return personas;
    }
}
