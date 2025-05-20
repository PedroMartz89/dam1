import dao.AlumnoDAO;
import dao.AlumnoDAOImpl;
import model.Alumno;
import util.ConexionBD;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws SQLException {
/*
        Connection conn = ConexionBD.getInstance();
        System.out.println(conn);
        conn.close();
        System.out.println("Fin del programa");

        ProductoDAO dao = new ProductoDAOImpl();
        List<Producto> productos = dao.recuperarProductos();

        System.out.println("Listado de productos en base de datos:");
        for (Producto p : productos) {
            System.out.println(p);
        }
 */
        //ConexionBD.crearBD();

        List<Alumno> listaAlumnos = leerAlumnos();
        //imprimirAlumnos(listaAlumnos);
        guardarAlumnos(listaAlumnos);
        List<Alumno> alumnos = recuperarAlumnos();
        imprimirAlumnos(alumnos);

        ConexionBD.cerrarConexion();

    }

    private static void imprimirAlumnos(List<Alumno> listaAlumnos) {

        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }

    }

    private static void guardarAlumnos(List<Alumno> listaAlumnos) {
        AlumnoDAO alumnoDAO = new AlumnoDAOImpl();
        for (Alumno alumno : listaAlumnos) {
            alumnoDAO.insertar(alumno);
        }
    }

    private static List<Alumno> recuperarAlumnos() {
        AlumnoDAO alumnoDAO = new AlumnoDAOImpl();
        return alumnoDAO.obtenerAlumnos();
    }

    public static List<Alumno> leerAlumnos() {
        List<Alumno> lista = new ArrayList<>();
        String file = "assets/alumnos.txt";

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split("&");
                Alumno a = new Alumno(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                lista.add(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }


}