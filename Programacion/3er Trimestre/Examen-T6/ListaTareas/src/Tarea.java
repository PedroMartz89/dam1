public class Tarea {

    private String nombre;
    private String responsable;
    private int numNecesitan;
    private String ubicacion;
    private boolean terminado;

    public Tarea(String nombre, String responsable, int numNecesitan, String ubicacion) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.numNecesitan = numNecesitan;
        this.ubicacion = ubicacion;
        this.terminado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public String getResponsable() {
        return responsable;
    }

    @Override
    public String toString() {
        return "- Tarea: " +
                "\nNombre: " + nombre +
                "\nResponsable: " + responsable +
                "\nCuántos la necesita: " + numNecesitan +
                "\nUbicacion: " + ubicacion +
                "\nTerminada: " + terminado;
    }
}
