
import java.util.ArrayList;

public class Modulo {

    private int id;
    private String nombre;
    private int curso;
    private int horas;
    private String profesor;
    private ArrayList<Alumno> arrayAlumnos;

    public Modulo(int id, String nombre, int curso, int horas, String profesor, ArrayList<Alumno> arrayAlumnos) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
        this.profesor = profesor;
        this.arrayAlumnos = arrayAlumnos;
    }

    public Modulo(int id, String nombre, int curso, int horas, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", curso=" + curso +
                ", horas=" + horas +
                ", profesor='" + profesor + '\'' +
                ", arrayAlumnos=" + arrayAlumnos +
                '}';
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getArrayAlumnos() {
        return arrayAlumnos;
    }

    public void setArrayAlumnos(ArrayList<Alumno> arrayAlumnos) {
        this.arrayAlumnos = arrayAlumnos;
    }
}
