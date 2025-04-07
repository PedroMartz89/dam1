public class Timbre {

    private boolean estado;

    public Timbre() {
        this.estado = false;
    }

    public void activar() {

        estado = true;
    }

    public void desactivar() {

        estado = false;
    }

    @Override
    public String toString() {
        return "Timbre{" +
                "estado=" + estado +
                '}';
    }
}
