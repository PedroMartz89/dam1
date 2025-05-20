package dao;

import model.Alumno;
import util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAOImpl implements AlumnoDAO {

    @Override
    public void insertar(Alumno a) {

        String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection conn = ConexionBD.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, a.getId());
            pstmt.setString(2, a.getNombre());
            pstmt.setString(3, a.getApellidos());
            pstmt.setString(4, a.getDni());
            pstmt.setString(5, a.getEmail());
            pstmt.setString(6, a.getDireccion());
            pstmt.setString(7, a.getTelefono());
            pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Alumno> obtenerAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();

        String sql = "SELECT * FROM alumno;";

        try{
            Connection conn = ConexionBD.getInstance();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id= rs.getInt(1);
                String nombre = rs.getString(2);
                String apellidos = rs.getString(3);
                String dni = rs.getString(4);
                String email = rs.getString(5);
                String direccion = rs.getString(6);
                String telefono = rs.getString(7);

                alumnos.add(new Alumno(id,nombre, apellidos, dni, email, direccion, telefono));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alumnos;

    }

}
