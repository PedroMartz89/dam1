import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    private static final Diccionario diccionario = new Diccionario();
    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    private static void rellenarDiccionario() {

        try {
            File fichero = new File("assets/palabras.txt");
            while (lector.hasNextLine()) {
                String datos[] = lector.

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}