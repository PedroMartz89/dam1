package datos;

import dao.Alumno;
import dao.AlumnoFP;
import dao.AlumnoPrimaria;
import modelo.AlumnoFPDAO;
import util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoFPDAOImpl implements AlumnoFPDAO {

    @Override
    public void insertar(Alumno a) {
        String sql = "INSERT INTO alumnofp VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
            pstmt.setString(8, "informatica");
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<AlumnoFP> recuperarAlumnos() {
        ArrayList<AlumnoFP> alumnos = new ArrayList<>();

        String sql = "select * FROM alumnoFP;";

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
                String familia = rs.getString(8);
                alumnos.add(new AlumnoFP(id, nombre, apellido, dni, email, dir, telf, familia));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return alumnos;
    }
}
