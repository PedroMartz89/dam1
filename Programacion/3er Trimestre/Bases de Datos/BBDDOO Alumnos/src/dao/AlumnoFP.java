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
}
