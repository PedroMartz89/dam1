package dao;

import model.Alumno;

import java.util.List;

public interface AlumnoDAO {
    void insertar(Alumno alumno);
    List<Alumno> obtenerAlumnos();
}

