package dao;

import model.Persona;
import util.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaDAOImpl implements PersonaDAO {

    @Override
    public void insertar(Persona persona) {
        String sql = "INSERT INTO persona VALUES (?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection conn = ConexionBD.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, persona.getId());
            pstmt.setString(2, persona.getNombre());
            pstmt.setString(3, persona.getApellidos());
            pstmt.setString(4, persona.getDni());
            pstmt.setString(5, persona.getEmail());
            pstmt.setString(6, persona.getDireccion());
            pstmt.setString(7, persona.getTelefono());
            pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
