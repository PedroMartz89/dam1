public class Main {
    public static void main(String[] args) {

        Sensor sensor1 = new Sensor(8.1);
        Timbre timbre1 = new Timbre();
        Alarma alarma1 = new Alarma(7.0, sensor1, timbre1);


        Sensor sensor2 = new Sensor(5);
        Timbre timbre2 = new Timbre();
        Alarma alarma2 = new Alarma(7.0, sensor2, timbre2);
        alarma1.comprobar();
        alarma2.comprobar();
        System.out.println(alarma1);
        System.out.println(alarma2);

        Sensor sensor3 = new Sensor(8);
        AlarmaLuminosa alarmaL1 = new AlarmaLuminosa(10, sensor3, new Timbre(),new Bombilla());
        alarmaL1.comprobar();
        System.out.println(alarmaL1);

    }
}