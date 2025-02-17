public class Main {
    public static void main(String[] args) {

        Movil movil = new Movil("Nothing Phone 2a", "Snapdragon 600", "8GB", "128GB","5000 mha","FullHD", "Android 15");
        Carta carta = new Carta("Pedro Martinez", "Jorge Hernandez", "Calle rojales", "Calle dr Fleming", 30833, 30200,0.6,false);
        Libro libro = new Libro("EL resplandor", "Stephen King", "Terror", 1977, 547853125, "DEBOLSILLO", "Novela de terror estadounidense...");

        System.out.println(libro);
        System.out.println();
        System.out.println(movil);
        System.out.println();
        System.out.println(carta);

    }
}