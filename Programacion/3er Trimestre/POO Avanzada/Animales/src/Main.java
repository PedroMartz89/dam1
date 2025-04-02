import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Animal> animales = new HashSet<>();

        animales.add(new Perro("Diana", 8, "hembra", 4 ));
        animales.add(new Gatito("Kira", 1, "hembra"));
        animales.add(new Rana("Gustavo", 2, "macho",4));

        for (Animal animalI : animales) {
            System.out.println(animalI);
            animalI.emitirSonido();
        }
    }
}