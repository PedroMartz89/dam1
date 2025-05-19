import dao.Alumno;
import dao.AlumnoFP;
import datos.AlumnoDAOFileImpl;
import datos.AlumnoDAOImpl;
import datos.AlumnoFPDAOImpl;
import modelo.AlumnoDAOFile;
import util.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        ConexionBD.createDatabase();
        AlumnoDAOImpl alumnoDao = new AlumnoDAOImpl();
        AlumnoFPDAOImpl alumnoFPDao = new AlumnoFPDAOImpl();
        AlumnoDAOFileImpl alumnoDaoFile = new AlumnoDAOFileImpl();

        ArrayList<Alumno> alumnosDBFile = alumnoDaoFile.recuperarFichero();

        System.out.println("Datos fichero");

        for (Alumno alumno : alumnosDBFile) {

            System.out.println(alumno);
        }

        for (Alumno a : alumnosDBFile) {
            alumnoDao.insertar(a);
        }

        System.out.println("Datos");
        ArrayList<AlumnoFP> alumnosFP = alumnoFPDao.recuperarAlumnos();

        for (Alumno alumno : alumnosFP) {

            System.out.println(alumno);
        }

    }
}
