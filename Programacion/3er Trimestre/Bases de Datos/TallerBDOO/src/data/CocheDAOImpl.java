package data;

import dao.CocheDAO;
import model.Coche;
import model.Vehiculo;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class CocheDAOImpl implements CocheDAO {

    @Override
    public void insert(Coche c) {
        String sql = "INSERT INTO coche VALUES(?, ?, ?, ?, ?)";
        try {

            Connection conn = DBConnection.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getMatricula());
            pstmt.setString(2, c.getMarca());
            pstmt.setString(3, c.getModelo());
            pstmt.setString(4, c.getAno());
            pstmt.setInt(5, c.getNumPuertas());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Coche c) throws SQLException {
        String sql = "DELETE FROM coche WHERE matricula = ?";
        Connection conn = DBConnection.getInstance();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, c.getMatricula());

        pstmt.executeUpdate();

        System.out.println("El vehículo con matrícula " + c.getMatricula() + " ha sido eliminado.");
    }

    @Override
    public ArrayList<Coche> get() throws SQLException {
        ArrayList<Coche> coches = new ArrayList<>();
        String sql = "SELECT * FROM coche;";
        Connection conn = DBConnection.getInstance();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            String matricula = rs.getString(1);
            String marca = rs.getString(2);
            String modelo = rs.getString(3);
            String ano = rs.getString(4);
            int numPuertas = rs.getInt(5);

            coches.add(new Coche(matricula, marca, modelo, ano, numPuertas));

        }

        return coches;
    }
}
