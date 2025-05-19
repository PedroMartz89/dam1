package modelo;

import dao.Alumno;

import java.util.ArrayList;
import java.util.List;

public interface AlumnoDAOFile {

    ArrayList<Alumno> recuperarFichero();

}
