public class Estudiante {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int curso;
    private int grado;
    private String universidad;
    private String correo;
    private int telefono;

    private static int numEstudiantes = 0;


    public static int obtenerNumEstudiantes() {

        return numEstudiantes;
    }

    public Estudiante() {
        numEstudiantes ++;
    }

    public Estudiante(String nombre, String apellido1, String apellido2, int curso, int grado, String universidad, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.curso = curso;
        this.grado = grado;
        this.universidad = universidad;
        this.correo = correo;
        this.telefono = telefono;
        numEstudiantes ++;
    }

    public Estudiante(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        numEstudiantes ++;
    }
    public String infoEstudiante() {

        return "Nombre: " +
                this.nombre + "\nApellidos: "
                + this.apellido1+ " "
                + this.apellido2 + "\nTeléfono: "
                + this.telefono + "\n Curso: "
                + this.curso + "\n Grado: "
                + this.grado + "\nUniversidad: "
                + this.universidad
                + "\nCorreo Electrónico: " + this.correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
