package model;

public class Alumno extends Persona{

    private String nre;

    public Alumno(String id, String nombre, String apellido, String dni, String email, String dir, String telf, String nre) {
        super(id, nombre, apellido, dni, email, dir, telf);
        this.nre = nre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nre='" + nre + '\'' +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", dir='" + dir + '\'' +
                ", telf='" + telf + '\'' +
                '}';
    }
}
