package datos;

import dao.Alumno;
import modelo.AlumnoDAO;
import util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoDAOImpl implements AlumnoDAO {

    @Override
    public void insertar(Alumno a) {

        String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {

            Connection conn = ConexionBD.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, a.getId());
            pstmt.setString(2, a.getNombre());
            pstmt.setString(3, a.getApellido());
            pstmt.setString(4, a.getDni());
            pstmt.setString(5, a.getEmail());
            pstmt.setString(6, a.getDir());
            pstmt.setString(7, a.getTelf());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Alumno> recuperarAlumnos() {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        String sql = "Select * FROM alumno;";

        try {
            Connection conn = ConexionBD.getInstance();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String dni = rs.getString(4);
                String email = rs.getString(5);
                String dir = rs.getString(6);
                String telf = rs.getString(7);

                alumnos.add(new Alumno(id, nombre, apellido, dni, email, dir, telf));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return alumnos;
    }


}
