public class Persona {

    private String nombre;
    private String dni;
    private String Apellido1;
    private String Apellido2;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public String nombreCompleto() {

        return this.getNombre() + " " + " " + this.getApellido1() + " " + this.getApellido2() + "con DNI: " + this.getDni();

    }


}
