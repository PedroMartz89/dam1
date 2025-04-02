public class Cliente {

    private String nombre;
    private String apellidos;
    private String nif;
    private String direccion;
    private String email;
    private String telefono;
    private String fecha_alta;
    private String tipo;
    private String descuento;
    private String matricula;

    public Cliente(String nombre, String apellidos, String nif, String direccion, String email, String telefono, String fecha_alta, String tipo, String descuento, String matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.fecha_alta = fecha_alta;
        this.tipo = tipo;
        this.descuento = descuento;
        this.matricula = matricula;
    }

    public String infoReducida() {
        return "----Cliente----" +
                "\nNombre: " + nombre +
                "\nNIF: " + nif +
                "\nEmail: " + email +
                "\nTeléfono: " + telefono +
                "\nMatricula: " + matricula +
                "\nFecha: " + fecha_alta;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nNIF: " + nif +
                "\nDireccion: " + direccion +
                "\nEmail: " + email +
                "  NIF: " + nif +
                "\nTeléfono: " + telefono +
                "\nFecha: " + fecha_alta +
                "\nTipo Cliente: " + tipo +
                "\nDescuento: " + descuento +
                "\nMatricula: " + matricula;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }


    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
