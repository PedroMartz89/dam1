import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
            Diccionario diccionario = new Diccionario();
        try {
            File fichero = new File("assets/palabras.txt");
            Scanner myReader = new Scanner(fichero);

            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] array = data.split(";");
                diccionario.nuevoPar(array[0], array[1]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
            e.printStackTrace();
        }
        
        Scanner teclado = new Scanner(System.in);
        int numAciertos = 0;
        int numFallos = 0;
        int totalPreguntas = 0;

        System.out.println("Bienvenido al cuestionario, escribe final para salir");
        while (true) {
            String palabra = diccionario.palabraAleatoria();
            System.out.println(palabra + ":" + diccionario.primeraLetraTraduccion(palabra) + "...");
            System.out.print("\nIndique la respuesta correcta: ");
            String respuesta = teclado.nextLine();
            if (respuesta.equals(diccionario.traduce(palabra))) {
                System.out.println("Respuesta correcta!!");
                numAciertos++;
                totalPreguntas++;
            } else if (respuesta.equals("final")){
                break;
            } else {

                System.out.println("Respuesta incorrecta");
                numFallos++;
                totalPreguntas++;
            }

        }

        System.out.println("ESTADÍSTICAS");
        System.out.println("Total preguntas: " + totalPreguntas);
        System.out.println("Total aciertos: " + numAciertos);
        System.out.println("Total fallos: " + numFallos);
        double fallos = ((double) numAciertos / totalPreguntas) * 100;
        System.out.println("Porcentaje de aciertos: " + fallos + "%");
    }

}