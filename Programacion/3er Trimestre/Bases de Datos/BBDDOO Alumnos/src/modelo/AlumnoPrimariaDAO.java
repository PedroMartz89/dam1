package modelo;

import dao.Alumno;
import dao.AlumnoPrimaria;

import java.util.ArrayList;

public interface AlumnoPrimariaDAO {

    void insertar(AlumnoPrimaria a);
    ArrayList<AlumnoPrimaria> recuperarAlumnos();
}
