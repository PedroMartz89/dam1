public class Main {
    public static void main(String[] args) {

        Industrial picadora = new Industrial("Picadora industrial", "726362571", "ProUltra", 8, 150);
        Domestica aspiradora = new Domestica("Aspiradora", "84798200", "Panasonic", 1);

        System.out.println(picadora);
        System.out.println(aspiradora);

        picadora.encender();
        aspiradora.encender();

        System.out.println(picadora);
        System.out.println(aspiradora);

        picadora.apagar();
        aspiradora.apagar();
    }
}
