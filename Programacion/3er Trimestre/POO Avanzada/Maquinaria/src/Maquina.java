public abstract class Maquina {

    private String tipo; //industrial o doméstico
    private String mumSerie;
    private String modelo;
    private int horasFuncionamiento;
    private boolean encendido;

    public Maquina(String tipo, String mumSerie, String modelo, int horasFuncionamiento) {
        this.tipo = tipo;
        this.mumSerie = mumSerie;
        this.modelo = modelo;
        this.horasFuncionamiento = horasFuncionamiento;
        this.encendido = false;
    }

    public abstract void encender();
    public abstract void apagar();

    @Override
    public String toString() {
        return "Maquina{" +
                "tipo='" + tipo + '\'' +
                ", mumSerie='" + mumSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", horasFuncionamiento=" + horasFuncionamiento +
                ", encendido: " + encendido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
