package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private static String user = "root";
    private static String passwd = "toor";
    private static String url = "jdbc:mysql://172.16.16.76:3306/";
    private static String database = "nieve1";
    private static Connection connection;

    public DBConnection() {
    }

    public static Connection getInstance() throws SQLException {

//        if (connection.isClosed() || connection == null) {

            connection = DriverManager.getConnection(url+database, user, passwd);

//        }

        return connection;
    }

    public static void createDB() throws SQLException {

        Connection conn = DriverManager.getConnection(url, user, passwd);
        Statement stmt = conn.createStatement();

        String drop = "DROP DATABASE IF EXISTS " + database+";";
        stmt.executeUpdate(drop);
        String create = "CREATE DATABASE IF NOT EXISTS " + database+";";
        stmt.executeUpdate(create);
        String use = "USE " + database+";";
        stmt.executeUpdate(use);
        String createEquip = "CREATE TABLE Equipamiento(id INT PRIMARY KEY,marca VARCHAR(50),modelo VARCHAR(50),valor DOUBLE,anio INT,numUsos INT,estado VARCHAR(50));";

        stmt.executeUpdate(createEquip);

        String createEsqui= "CREATE TABLE Esqui(id INT PRIMARY KEY,marca VARCHAR(50),modelo VARCHAR(50),valor DOUBLE,anio INT,numUsos INT,estado VARCHAR(50),talla INT,fijaciones boolean);";

        stmt.executeUpdate(createEsqui);

        String createSnow= "CREATE TABLE Snowboard(id INT PRIMARY KEY,marca VARCHAR(50),modelo VARCHAR(50),valor DOUBLE,anio INT,numUsos INT,estado VARCHAR(50),tipo VARCHAR(50),botas boolean);";

        stmt.executeUpdate(createSnow);

        System.out.println("Base de datos creada correctamente");
    }
}
