package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    private static String user = "root";
    private static String passwd = "toty";
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String dataBase = "escuela";
    private static Connection connection;

    Connection conection;

    public ConexionBD() {}

    public static Connection getInstance() throws SQLException {

        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url+dataBase, user, passwd);
        }
        return connection;
    }

    public static void createDatabase() throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, passwd);
        Statement statement = conn.createStatement();
        //Borrar base de datos
        statement.executeUpdate("drop database escuela;");

        // SQL para crear la base de datos
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + dataBase;

        // Ejecutar el SQL para crear la base de datos
        statement.executeUpdate(createDatabaseSQL);
        System.out.println("Base de datos '" + dataBase + "' creada o ya existe.");

        // Seleccionamos la base de datos creada para continuar con las operaciones sobre ella
        String useDatabaseSQL = "USE " + dataBase;
        statement.executeUpdate(useDatabaseSQL);
        System.out.println("Usando la base de datos: " + dataBase);

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

        String sql4= "CREATE TABLE IF NOT EXISTS  alumnoPrimaria (" +
                " id INT PRIMARY KEY, nombre VARCHAR(100), apellidos VARCHAR(100), dni VARCHAR(20), " +
                " email VARCHAR(100), direccion VARCHAR(200), telefono VARCHAR(20), curso VARCHAR(20));";
        statement.executeUpdate(sql4);
        System.out.println("Tabla 'alumnoPrimaria' creada.");

        String sql5= "CREATE TABLE IF NOT EXISTS  alumnoFP (" +
                " id INT PRIMARY KEY, nombre VARCHAR(100), apellidos VARCHAR(100), dni VARCHAR(20), " +
                " email VARCHAR(100), direccion VARCHAR(200), telefono VARCHAR(20), familia VARCHAR(20));";
        statement.executeUpdate(sql5);
        System.out.println("Tabla 'alumnoFP' creada.");

        statement.close();
        conn.close();

    }
}
