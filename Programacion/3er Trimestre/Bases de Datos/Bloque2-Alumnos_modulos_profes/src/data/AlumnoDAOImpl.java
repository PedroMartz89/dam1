package data;

import dao.AlumnoDAO;
import model.Alumno;
import model.Persona;
import utils.DBConection;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoDAOImpl implements AlumnoDAO {

    @Override
    public void insert(Persona p) {

        try {

            Connection conn = DBConection.getInstance();
            String sql = "INSERT INTO alumno VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p.getId());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getApellido());
            stmt.setString(4, p.getDni());
            stmt.setString(5, p.getEmail());
            stmt.setString(6, p.getDir());
            stmt.setString(7, p.getTelf());
            stmt.setString(8, "82743201");
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Alumno> recuperar() {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        try {
            Connection conn = DBConection.getInstance();
            String sql = "SELECT * FROM alumno;";
            Statement stmt = conn.createStatement();

            ResultSet resultSet = stmt.executeQuery(sql);

            while (resultSet.next()) {

                String id = resultSet.getString(1);
                String nombre = resultSet.getString(2);
                String apellido = resultSet.getString(3);
                String dni = resultSet.getString(4);
                String email = resultSet.getString(5);
                String dir = resultSet.getString(6);
                String telf = resultSet.getString(7);
                String nre = resultSet.getString(8);

                alumnos.add(new Alumno(id, nombre, apellido, dni, email, dir, telf, nre));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return alumnos;
    }
}
