package data;

import dao.EsquiDAO;
import model.Esqui;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class EsquiDAOImpl implements EsquiDAO {

    @Override
    public void addEsqui(Esqui e) throws SQLException {

        String sql = "INSERT INTO Esqui VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        Connection conn = DBConnection.getInstance();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, e.getId());
        pstmt.setString(2, e.getMarca());
        pstmt.setString(3, e.getModelo());
        pstmt.setDouble(4, e.getValorCompra());
        pstmt.setInt(5, e.getAnioCompra());
        pstmt.setInt(6, e.getNumUsos());
        pstmt.setString(7, e.getEstado());
        pstmt.setInt(8, e.getTalla());
        pstmt.setBoolean(9, e.isFijaciones());

        pstmt.executeUpdate();
    }

    @Override
    public void deleteEsqui(Esqui e) throws SQLException {

        String sql = "DELETE FROM Esqui WHERE id = ?;";
        Connection conn = DBConnection.getInstance();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, e.getId());
        pstmt.executeUpdate();
        System.out.println("Eliminado correctamente");

    }

    @Override
    public void updateEsqui(Esqui e) {

    }

    @Override
    public ArrayList<Esqui> getAllEsquis() throws SQLException {

        String sql = "SELECT * FROM Esqui;";
        Connection conn = DBConnection.getInstance();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Esqui> esquis = new ArrayList<>();

        while (rs.next()) {

            int id = rs.getInt(1);
            String marca = rs.getString(2);
            String modelo = rs.getString(3);
            double valorCompra = rs.getDouble(4);
            int anioCompra = rs.getInt(5);
            int numUsos = rs.getInt(6);
            String estado = rs.getString(7);
            int talla = rs.getInt(8);
            boolean fijaciones = rs.getBoolean(9);

            esquis.add(new Esqui(id, marca, modelo, valorCompra, anioCompra, numUsos, estado, talla, fijaciones));

        }

        return esquis;
    }
}
