package dao;

import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;

public interface ProfesorDAO {
    void insert(Persona p);
    ArrayList<Profesor> recuperar();
}
