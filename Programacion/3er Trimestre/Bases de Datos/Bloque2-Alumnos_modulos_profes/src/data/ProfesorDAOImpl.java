package data;

import dao.PersonaDAO;
import dao.ProfesorDAO;
import model.Alumno;
import model.Persona;
import model.Profesor;
import utils.DBConection;

import java.sql.*;
import java.util.ArrayList;

public class ProfesorDAOImpl implements ProfesorDAO {

    @Override
    public void insert(Persona a) {

        try {
            Connection conn = DBConection.getInstance();
            String sql = "INSERT INTO profesor VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, a.getId());
            pstmt.setString(2, a.getNombre());
            pstmt.setString(3, a.getApellido());
            pstmt.setString(4, a.getDni());
            pstmt.setString(5, a.getEmail());
            pstmt.setString(6, a.getDir());
            pstmt.setString(7, a.getTelf());
            pstmt.setString(8, "Informática");
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public ArrayList<Profesor> recuperar() {

        ArrayList<Profesor> profesores = new ArrayList<>();

        try {

            Connection conn = DBConection.getInstance();
            String sql = "SELECT * FROM profesor";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String dni = rs.getString(4);
                String email = rs.getString(5);
                String dir = rs.getString(6);
                String telf= rs.getString(7);
                String espec = rs.getString(8);

                profesores.add(new Profesor(id, nombre, apellido, dni, email, dir, telf ,espec));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return profesores;
    }
}
