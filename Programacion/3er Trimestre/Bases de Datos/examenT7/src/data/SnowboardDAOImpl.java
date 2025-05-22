package data;

import dao.SnowboardDAO;
import model.Esqui;
import model.Snowboard;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class SnowboardDAOImpl implements SnowboardDAO {
    @Override
    public void addSnowboard(Snowboard s) throws SQLException {
        String sql = "INSERT INTO Snowboard VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        Connection conn = DBConnection.getInstance();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, s.getId());
        pstmt.setString(2, s.getMarca());
        pstmt.setString(3, s.getModelo());
        pstmt.setDouble(4, s.getValorCompra());
        pstmt.setInt(5, s.getAnioCompra());
        pstmt.setInt(6, s.getNumUsos());
        pstmt.setString(7, s.getEstado());
        pstmt.setString(8, s.getTipo());
        pstmt.setBoolean(9, s.isBotas());

        pstmt.executeUpdate();
    }

    @Override
    public void deleteSnowboard(Snowboard s) throws SQLException {

        String sql = "DELETE FROM Snowboard WHERE id = ?;";
        Connection conn = DBConnection.getInstance();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, s.getId());
        pstmt.executeUpdate();
        System.out.println("Eliminado correctamente");
    }

    @Override
    public void updateSnowboard(Snowboard s) {

    }

    @Override
    public ArrayList<Snowboard> getAllSnowboards() throws SQLException {
        String sql = "SELECT * FROM Snowboard;";
        Connection conn = DBConnection.getInstance();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Snowboard> snowboards = new ArrayList<>();

        while (rs.next()) {

            int id = rs.getInt(1);
            String marca = rs.getString(2);
            String modelo = rs.getString(3);
            double valorCompra = rs.getDouble(4);
            int anioCompra = rs.getInt(5);
            int numUsos = rs.getInt(6);
            String estado = rs.getString(7);
            String tipo = rs.getString(8);
            boolean botas = rs.getBoolean(9);

            snowboards.add(new Snowboard(id, marca, modelo, valorCompra, anioCompra, numUsos, estado, tipo, botas));

        }

        return snowboards;
    }
}
