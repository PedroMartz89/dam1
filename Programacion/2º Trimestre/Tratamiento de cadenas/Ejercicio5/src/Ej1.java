import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        String cadena = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres");
        cadena = teclado.nextLine();

        System.out.println("La palabra "+ cadena + "al revés es: " + invertirTexto(cadena));

        }

            public static String invertirTexto(String cadena) {
                String nuevaCadena = "";

                for (int i = cadena.length(); i < 0; i--) {
                    nuevaCadena = nuevaCadena + cadena.charAt(i);
                }

                return nuevaCadena;
    }
}