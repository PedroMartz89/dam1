package dao;

import model.Alumno;
import model.Persona;

import java.util.ArrayList;

public interface AlumnoDAO {

    void insert(Persona p);
    ArrayList<Alumno> recuperar();
}
