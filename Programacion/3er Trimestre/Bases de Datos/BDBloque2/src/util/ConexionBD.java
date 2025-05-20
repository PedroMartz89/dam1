package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    private static String url = "jdbc:mysql://localhost:3306/";
    private static String usuario = "root";
    private static String password = "1234qwer";
    private static String nameBD = "escuela";

    //El atributo más importante es el singleton, la conexión:
    private static Connection connection;

    // Constructor privado para evitar instanciación
    private ConexionBD() {}

    public static Connection getInstance() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url+nameBD, usuario, password);
        }
        return connection;
    }


    public static void cerrarConexion() throws SQLException {

        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Conexion con base de datos cerrada");
        }
    }

    public static void crearBD() throws SQLException {

        // Crear conexión con MySQL
        try {
            Connection conn = DriverManager.getConnection(url, usuario, password);
            Statement statement = conn.createStatement();

            // SQL para crear la base de datos
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + nameBD;

            // Ejecutar el SQL para crear la base de datos
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Base de datos '" + nameBD + "' creada o ya existe.");

            // Seleccionamos la base de datos creada para continuar con las operaciones sobre ella
            String useDatabaseSQL = "USE " + nameBD;
            statement.executeUpdate(useDatabaseSQL);
            System.out.println("Usando la base de datos: " + nameBD);

            // Ahora puedes crear tablas u otros objetos dentro de la base de datos
            String sql1= "CREATE TABLE IF NOT EXISTS  alumno (" +
                    " id INT PRIMARY KEY, nombre VARCHAR(100), apellidos VARCHAR(100), dni VARCHAR(20), " +
                    " email VARCHAR(100), direccion VARCHAR(200), telefono VARCHAR(20));";

            statement.executeUpdate(sql1);
            System.out.println("Tabla 'Alumno' creada.");

            String sql2= "CREATE TABLE modulo (id INT PRIMARY KEY, nombre VARCHAR(100)," +
                    " curso INT, horas INT, profesor VARCHAR(100) );";

            statement.executeUpdate(sql2);
            System.out.println("Tabla 'modulo' creada.");

            String sql3= "CREATE TABLE modulo_alumno (id_alumno INT, id_modulo INT," +
                    " PRIMARY KEY (id_alumno, id_modulo), FOREIGN KEY (id_alumno) REFERENCES alumno(id), " +
                    " FOREIGN KEY (id_modulo) REFERENCES modulo(id));";

            statement.executeUpdate(sql3);
            System.out.println("Tabla 'modulo_alumno' creada.");

            statement.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

