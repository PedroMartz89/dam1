package dao;

import model.Alumno;
import model.Persona;

import java.util.ArrayList;

public interface PersonaDAO {
    void insert(Persona p);
    ArrayList<Persona> recuperar();
}
