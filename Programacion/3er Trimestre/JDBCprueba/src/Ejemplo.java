import java.sql.*;

public class Ejemplo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Registramos el driver

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://r2d2:3306/tienda";
        String user = "alumno";
        String passwd = "alumno";

        try {
            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexión establecida");

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM producto;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getDouble(3) + "€");
                System.out.println("---------------------------------------------------------------------------------------------");

                String query1 = "";

                conn.setAutoCommit(false);
                stmt.addBatch(query1);
                stmt.executeBatch();

                conn.commit();
                conn.setAutoCommit(true);
            }

            //conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
