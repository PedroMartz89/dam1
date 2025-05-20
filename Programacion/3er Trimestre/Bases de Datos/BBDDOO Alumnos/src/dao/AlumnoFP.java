package dao;

public class AlumnoFP extends Alumno{

    private String familia;

    public AlumnoFP(String id, String nombre, String apellido, String dni, String email, String dir, String telf, String familia) {
        super(id, nombre, apellido, dni, email, dir, telf);
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    @Override
    public String toString() {
        return "AlumnoFP{" +
                "familia='" + familia + '\'' +
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
