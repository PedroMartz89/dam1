package modelo;

import dao.Alumno;

import java.util.ArrayList;

public interface AlumnoDAO {

    void insertar(Alumno alumno);
    ArrayList<Alumno> recuperarAlumnos();

}
