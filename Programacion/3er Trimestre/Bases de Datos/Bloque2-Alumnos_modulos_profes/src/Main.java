import dao.PersonaDAOFile;
import data.AlumnoDAOImpl;
import data.PersonaDAOFileImpl;
import data.PersonaDAOImpl;
import data.ProfesorDAOImpl;
import model.Alumno;
import model.Persona;
import model.Profesor;
import utils.DBConection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBConection.createDatabase();
        PersonaDAOImpl personaDAO = new PersonaDAOImpl();
        PersonaDAOFile personaDAOFile = new PersonaDAOFileImpl();
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        ProfesorDAOImpl profesorDAO = new ProfesorDAOImpl();

        //PERSONAS
        System.out.println("---- Añadir Personas ----");
        ArrayList<Persona> personas = personaDAOFile.recuperarFile();

        //Insertar personas a la base de datos

        for (Persona p : personas) {
            personaDAO.insert(p);
        }

        //Ver personas insertadas
        System.out.println("---- Personas insertadas ----");
        ArrayList<Persona> personasInsert = personaDAO.recuperar();
        for (Persona p : personasInsert) {
            System.out.println(p);
        }

        //Insertar Alumnos
        System.out.println("Alumnos insertados");
        for (Persona p : personasInsert) {

            alumnoDAO.insert(p);
        }

        //Recuperar alumnos

        ArrayList<Alumno> alumnos = alumnoDAO.recuperar();

        //Imprimir alumnos
        System.out.println("Alumnos");

        for (Alumno a : alumnos) {

            System.out.println(a);
        }

        //Insertar Profes
        System.out.println("Profesores insertados");
        for (Persona p : personasInsert) {

            profesorDAO.insert(p);
        }

        //Recuperar Profes

        ArrayList<Profesor> profesores = profesorDAO.recuperar();

        //Imprimir Profes
        System.out.println("Profesores");

        for (Profesor p : profesores) {

            System.out.println(p);
        }
    }
}