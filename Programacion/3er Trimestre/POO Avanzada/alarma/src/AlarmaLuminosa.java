public class AlarmaLuminosa extends  Alarma {

    private Bombilla bombilla;

    public AlarmaLuminosa(double umbral, Sensor sensor, Timbre timbre, Bombilla bombilla) {
        super(umbral, sensor, timbre);
        this.bombilla = bombilla;
    }

    @Override
    public void comprobar() {
        super.comprobar();
        if (sensor.getValorActual() > this.umbral) {
            bombilla.activar();
            System.out.println("Se ha activado la bombilla");
        } else {
            bombilla.desactivar();
            System.out.println("Se ha desactivado la bombilla");
        }
    }
}
