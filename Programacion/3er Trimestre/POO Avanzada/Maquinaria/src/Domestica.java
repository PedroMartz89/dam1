public class Domestica extends Maquina{

    public Domestica(String tipo, String mumSerie, String modelo, int horasFuncionamiento) {
        super(tipo, mumSerie, modelo, horasFuncionamiento);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo la máquina " + getTipo() + " desde el botón de encender");
        setEncendido(true);
    }

    @Override
    public void apagar() {
        System.out.println("Encendiendo la máquina " + getTipo() + " desde el botón de apagar");
        setEncendido(false);
    }


}
