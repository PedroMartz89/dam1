import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        Persona p1 = new Persona("Mario", 187, 22);
        Persona p2 = new Persona("Pepe", 173, 52);
        Persona p3 = new Persona("Manuel", 158, 27);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        Collections.sort(personas);

        for (Persona p : personas) {

            System.out.println(p);
        }
    }
}