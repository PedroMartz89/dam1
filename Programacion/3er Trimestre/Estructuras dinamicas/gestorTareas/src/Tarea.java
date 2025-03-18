import java.util.ArrayList;

public class Tarea {

    private String nombre;
    private String nombreResponsable;
    private int personasNecesitan;
    private String ubicacion;
    private boolean terminada;

    public Tarea(String nombre, String nombreResponsable, int personasNecesitan, String ubicacion) {
        this.nombre = nombre;
        this.nombreResponsable = nombreResponsable;
        this.personasNecesitan = personasNecesitan;
        this.ubicacion = ubicacion;
        this.terminada = terminada;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    @Override
    public String toString() {
        return "\nTarea: " +
                "\nnombre: '" + nombre + '\'' +
                "\nnombreResponsable: '" + nombreResponsable + '\'' +
                "\npersonasNecesitan: " + personasNecesitan +
                "\nubicacion: '" + ubicacion + '\'' +
                "\nterminada: " + terminada + "\n";
    }
}
