package data;

import dao.PersonaDAO;
import model.Alumno;
import model.Persona;
import utils.DBConection;

import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PersonaDAOImpl implements PersonaDAO {
    @Override
    public void insert(Persona p) {
        try {
            Connection conn = DBConection.getInstance();
            String sql = "INSERT INTO persona VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p.getId());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getApellido());
            stmt.setString(4, p.getDni());
            stmt.setString(5, p.getEmail());
            stmt.setString(6, p.getDir());
            stmt.setString(7, p.getTelf());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public ArrayList<Persona> recuperar() {
        ArrayList<Persona> personas = new ArrayList<>();

        try {
            Connection conn = DBConection.getInstance();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Persona";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellidos = rs.getString(3);
                String dni = rs.getString(4);
                String email = rs.getString(5);
                String dir = rs.getString(6);
                String telf = rs.getString(7);

                personas.add(new Persona(id, nombre, apellidos, dni, email, dir, telf));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return personas;
    }
}
