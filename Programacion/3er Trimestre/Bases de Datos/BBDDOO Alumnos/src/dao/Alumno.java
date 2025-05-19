package dao;

public class Alumno {

    private String id;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String dir;
    private String telf;

    public Alumno(String id, String nombre, String apellido, String dni, String email, String dir, String telf) {
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
        return "Alumno{" +
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
