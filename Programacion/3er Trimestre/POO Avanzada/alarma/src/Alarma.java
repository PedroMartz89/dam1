public class Alarma {

    protected double umbral;
    protected Sensor sensor;
    protected Timbre timbre;

    public Alarma(double umbral, Sensor sensor, Timbre timbre) {
        this.umbral = umbral;
        this.sensor = sensor;
        this.timbre = timbre;
    }

    public void comprobar() {

        if (sensor.getValorActual() > this.umbral) {
            timbre.activar();
            System.out.println("Se ha activado timbre");
        } else {
            timbre.desactivar();
            System.out.println("Se ha desactivado el timbre");
        }
    }

    @Override
    public String toString() {
        return "Alarma{" +
                "umbral=" + umbral +
                ", sensor=" + sensor +
                ", timbre=" + timbre +
                '}';
    }
}
