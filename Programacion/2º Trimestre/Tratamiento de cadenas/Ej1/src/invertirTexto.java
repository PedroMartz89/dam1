import java.util.Scanner;
public class invertirTexto {

    public static void main(String[] args) {


        System.out.println(invertirTexto("Introducción"));
    }

    public static String invertirTexto(String cadena) {
        String nuevaCadena = "";

        for (int i = 0 ; i < cadena.length() ; i++) {
            nuevaCadena = cadena.charAt(i) + nuevaCadena;
        }

        return nuevaCadena;
    }
}