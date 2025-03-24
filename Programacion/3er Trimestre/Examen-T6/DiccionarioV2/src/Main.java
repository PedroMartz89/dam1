import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Diccionario diccionario = new Diccionario();

        try {

            File fichero = new File("assets/palabras.txt");
            Scanner rd = new Scanner(fichero);

            while (rd.hasNextLine()) {
                String data = rd.nextLine();
                String[] pareja = data.split(";");
                diccionario.nuevoPar(pareja[0], pareja[1]);
            }
            rd.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        double numAciertos = 0;
        double numFallos = 0;
        int numPreguntas = 0;
        Scanner teclado = new Scanner(System.in);

        while (true) {
            String palabra = diccionario.palabraAleatoria();
            char caracter = diccionario.primeraLetraTraduccion(palabra);

            System.out.println(palabra + ": " + caracter + "...");
            System.out.print("Escribe la respuesta: ");
            String respuesta = teclado.nextLine();

            if (respuesta.equals(diccionario.traduce(palabra))) {

                System.out.println("CORRECTO!!");
                numPreguntas++;
                numAciertos++;

            } else if (respuesta.equals("final")) {
                break;

            } else {

                System.out.println("Incorrecto!");
                numFallos++;
                numPreguntas++;

            }

        }

        double fallos = ((double) numAciertos / numPreguntas) * 100;

        String texto = "Estadísticas" +
                "\nTotal preguntas: " + numPreguntas +
                "\nTotal aciertos: " + numAciertos +
                "\nTotal fallos: " + numFallos +
                "\nEstadística de fallos: "+ fallos +"%";

        System.out.println(texto);

        File stats = new File("assets/stats.txt");

        try {
            FileWriter fw = new FileWriter(stats);
            fw.write(texto);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}