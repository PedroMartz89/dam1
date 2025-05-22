package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private static String user = "root";
    private static String passwd = "toty";
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String database = "taller";
    private static Connection connection;


    public static Connection getInstance() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url+database, user, passwd);
        }
        return connection;
    }

    public static void closeInstance() {

        connection = null;
    }

    public static void createDatabase() throws SQLException {

        String drop = "DROP DATABASE taller";
        String createDB = "CREATE DATABASE IF NOT EXISTS taller;";
        String use = "USE taller";
        String createVehiculo = "CREATE TABLE IF NOT EXISTS vehiculo(matricula VARCHAR(20) PRIMARY KEY,marca VARCHAR(50) NOT NULL, modelo VARCHAR(50) NOT NULL,ano INT NOT NULL);";
        String createCoche = "CREATE TABLE IF NOT EXISTS coche(matricula VARCHAR(20) PRIMARY KEY,marca VARCHAR(50) NOT NULL, modelo VARCHAR(50) NOT NULL,ano INT NOT NULL,numPuertas INT NOT NULL);";
        String createMoto = "CREATE TABLE IF NOT EXISTS moto(matricula VARCHAR(20) PRIMARY KEY,marca VARCHAR(50) NOT NULL, modelo VARCHAR(50) NOT NULL,ano INT NOT NULL, tipoManillar VARCHAR(50) NOT NULL );";

        Connection conn = DriverManager.getConnection(url, user, passwd);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(drop);
        stmt.executeUpdate(createDB);
        stmt.executeUpdate(use);
        stmt.executeUpdate(createVehiculo);
        stmt.executeUpdate(createCoche);
        stmt.executeUpdate(createMoto);

        System.out.println("Base de datos creada con éxito.");
    }
}
