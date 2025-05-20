package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConection {

    private static String user = "root";
    private static String passwd = "toty";
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String database = "escuela";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {

        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url+database, user, passwd);
        }
        return connection;
    }

    public static void createDatabase() throws SQLException {

        Connection conn = getInstance();
        Statement stmt = conn.createStatement();
        String drop = "drop database escuela;";
        String sql = "CREATE DATABASE IF NOT EXISTS escuela;";
        String sql1 = "USE escuela;";
        String sql2 = "CREATE TABLE IF NOT EXISTS persona (id INT PRIMARY KEY, nombre VARCHAR(100), apellidos VARCHAR(100),dni VARCHAR(20),email VARCHAR(100),direccion VARCHAR(200),telefono VARCHAR(20));";
        String sql3 = "CREATE TABLE IF NOT EXISTS alumno (id INT PRIMARY KEY, nombre VARCHAR(100), apellidos VARCHAR(100),dni VARCHAR(20),email VARCHAR(100),direccion VARCHAR(200),telefono VARCHAR(20), nre VARCHAR(20));";
        String sql4 = "CREATE TABLE IF NOT EXISTS profesor (id INT PRIMARY KEY, nombre VARCHAR(100), apellidos VARCHAR(100),dni VARCHAR(20),email VARCHAR(100),direccion VARCHAR(200),telefono VARCHAR(20), especialidad VARCHAR(20));";

        stmt.executeUpdate(drop);
        stmt.executeUpdate(sql);
        stmt.executeUpdate(sql1);
        stmt.executeUpdate(sql2);
        stmt.executeUpdate(sql3);
        stmt.executeUpdate(sql4);

        conn.close();
        stmt.close();
    }
}
