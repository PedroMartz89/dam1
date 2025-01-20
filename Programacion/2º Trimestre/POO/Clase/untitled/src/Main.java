public class Main {
    public static void main(String[] args) {

        TelefonoMovil telefono2 = new TelefonoMovil("A55", 350, "Samsung");

        Bateria bat2 = new Bateria("Modelo2");

        telefono2.setBateria(bat2);

        System.out.println(telefono2.toString());
    }
}
