public class Alumno {

    private String nombre;
    private String apellidos;
    private int nre;
    private String email;
    private String direccion;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int nre, String email, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nre = nre;
        this.email = email;
        this.direccion = direccion;
    }


    public String info() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nre=" + nre +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNre() {
        return nre;
    }

    public void setNre(int nre) {
        this.nre = nre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
