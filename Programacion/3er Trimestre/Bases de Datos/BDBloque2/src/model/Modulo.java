package model;

public class Modulo {
    private int id;
    private String nombre;
    private int curso;
    private int horas;
    private String profesor;

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
                '}';
    }

}
