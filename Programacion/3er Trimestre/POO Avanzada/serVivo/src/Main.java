public class Main {
    public static void main(String[] args) {

        Animal kiwi = new Animal("Apteryx", "Kiwi", "Apterygidae","Omnívora", 1.2, 25);
        Vegetal romero = new Vegetal("Salvia rosmarinus", "Romero", "Salvia", 200);

        System.out.println(kiwi);
        System.out.println(romero);

        kiwi.alimentarse();
        romero.alimentarse();
    }
}