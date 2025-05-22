package data;

import dao.MotoDAO;
import model.Moto;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class MotoDAOImpl implements MotoDAO {

    @Override
    public void insert(Moto m) throws SQLException {

        String sql = "INSERT INTO moto VALUES(?, ?, ?, ?, ?)";
        Connection conn = DBConnection.getInstance();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, m.getMatricula());
        pstmt.setString(2, m.getMarca());
        pstmt.setString(3, m.getModelo());
        pstmt.setString(4, m.getAno());
        pstmt.setString(5, m.getTipoManillar());

        pstmt.executeUpdate();

    }

    @Override
    public void delete(Moto m) throws SQLException {

        String sql = "DELETE FROM moto WHERE matricula = ?;";
        Connection conn = DBConnection.getInstance();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, m.getMatricula());
        System.out.println("Moto con matrícula " + m.getMatricula() + " eliminado correctamente.");

        pstmt.executeUpdate();
    }

    @Override
    public ArrayList<Moto> get() throws SQLException {
        ArrayList<Moto> motos = new ArrayList<>();
        Connection conn = DBConnection.getInstance();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM moto";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String matricula = rs.getString(1);
            String marca = rs.getString(2);
            String modelo = rs.getString(3);
            String ano = rs.getString(4);
            String tipoManillar = rs.getString(5);

            motos.add(new Moto(matricula, marca, modelo, ano, tipoManillar));
        }

        return motos;
    }
}
