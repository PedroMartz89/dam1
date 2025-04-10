import java.io.Serializable;

public class Alumno implements Serializable {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private byte edad;

    public Alumno(String nombre, String apellido1, String apellido2, byte edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public byte getEdad() {
        return edad;
    }


}
