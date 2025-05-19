package modelo;

import dao.Alumno;
import dao.AlumnoFP;
import dao.AlumnoPrimaria;

import java.util.ArrayList;

public interface AlumnoFPDAO {

    void insertar(AlumnoFP a);
    ArrayList<AlumnoFP> recuperarAlumnos();

}
