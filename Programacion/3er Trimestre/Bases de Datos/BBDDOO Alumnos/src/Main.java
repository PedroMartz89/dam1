import dao.Alumno;
import dao.AlumnoFP;
import dao.AlumnoPrimaria;
import datos.AlumnoDAOFileImpl;
import datos.AlumnoDAOImpl;
import datos.AlumnoFPDAOImpl;
import datos.AlumnoPrimariaDAOImpl;
import modelo.AlumnoDAOFile;
import modelo.AlumnoPrimariaDAO;
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
        AlumnoPrimariaDAOImpl alumnoPrimariaDAO = new AlumnoPrimariaDAOImpl();
        ArrayList<Alumno> alumnosDBFile = alumnoDaoFile.recuperarFichero();

        System.out.println("Datos fichero");

        for (Alumno alumno : alumnosDBFile) {

            System.out.println(alumno);
        }

        for (Alumno a : alumnosDBFile) {
            alumnoDao.insertar(a);
        }

        System.out.println("Datos");

        for (Alumno alumno : alumnosDBFile) {

            alumnoFPDao.insertar(alumno);
        }

        ArrayList<AlumnoFP> alumnosFP = alumnoFPDao.recuperarAlumnos();
        System.out.println("---- IMPRIMIR ALUMNOSFP ----");
        for (AlumnoFP alumnofp : alumnosFP) {
            System.out.println(alumnofp);
        }

        //insertar alumnos primaria
        for (Alumno alumnoPrimaria : alumnosDBFile) {
            alumnoPrimariaDAO.insertar(alumnoPrimaria);
        }

        ArrayList<AlumnoPrimaria> alumnosPrimaria = alumnoPrimariaDAO.recuperarAlumnos();
        System.out.println("---- IMPRIMIR ALUMNOS PRIMARIA ----");
        for (AlumnoPrimaria alumnoPrimaria : alumnosPrimaria) {
            System.out.println(alumnoPrimaria);
        }
    }
}
