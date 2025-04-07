public class Bombilla extends Timbre{

    private boolean encendido;

    public Bombilla() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public String toString() {
        return "Bombilla{" +
                "encendido=" + encendido +
                '}';
    }
}
