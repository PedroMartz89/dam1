package model;

public class Persona {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String email;
    protected String dir;
    protected String telf;

    public Persona(String id, String nombre, String apellido, String dni, String email, String dir, String telf) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.dir = dir;
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", dir='" + dir + '\'' +
                ", telf='" + telf + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getDir() {
        return dir;
    }

    public String getTelf() {
        return telf;
    }
}
