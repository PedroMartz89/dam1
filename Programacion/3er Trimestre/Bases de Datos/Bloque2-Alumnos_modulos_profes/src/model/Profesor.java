package model;

public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String id, String nombre, String apellido, String dni, String email, String dir, String telf, String especialidad) {
        super(id, nombre, apellido, dni, email, dir, telf);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "especialidad='" + especialidad + '\'' +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", dir='" + dir + '\'' +
                ", telf='" + telf + '\'' +
                '}';
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
