public class Industrial extends Maquina{

    private double consumo;

    public Industrial(String tipo, String mumSerie, String modelo, int horasFuncionamiento, double consumo) {
        super(tipo, mumSerie, modelo, horasFuncionamiento);
        this.consumo = consumo;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo la máquina " + getTipo() + " desde el panel de control");
        setEncendido(true);
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la máquina " + getTipo() + " desde el panel de control");
        setEncendido(false);
    }


}
