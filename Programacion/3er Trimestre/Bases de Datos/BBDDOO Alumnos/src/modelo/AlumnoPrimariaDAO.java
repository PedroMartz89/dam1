package modelo;

import dao.Alumno;
import dao.AlumnoPrimaria;

import java.util.ArrayList;

public interface AlumnoPrimariaDAO {

    void insertar(Alumno a);
    ArrayList<AlumnoPrimaria> recuperarAlumnos();
}
