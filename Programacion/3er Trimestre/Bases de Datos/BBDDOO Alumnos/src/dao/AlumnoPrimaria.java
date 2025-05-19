package dao;

public class AlumnoPrimaria extends Alumno {

    private String curso;

    public AlumnoPrimaria(String id, String nombre, String apellido, String dni, String email, String dir, String telf, String curso) {
        super(id, nombre, apellido, dni, email, dir, telf);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "AlumnoPrimaria{" +
                "curso='" + curso + '\'' +
                '}';
    }

    public String getCurso() {
        return curso;
    }
}
