
import java.util.Scanner;
import java.util.regex.Pattern;

public class simulacroVerbos {
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Introduce una frase: ");
            String texto = teclado.nextLine();

            //Pattern pattern = Pattern.compile("([A-Za-z]+(ar|er|ir)$)");
            //Marcher matcher = new Marcher();
            //String nuevoTexto = matcher.replaceAll("(VERBO)");

            System.out.println(nuevoTexto(texto));
        }
       
    }

    public static String nuevoTexto(String texto) {
        
        String textoNuevo = "";
        String[] arrayPalabras = texto.split(" ");
        String patron = "[A-Za-z]*(ar|er|ir)$";
        Pattern p = Pattern.compile(patron);

        for (String palabra : arrayPalabras) {
            if (p.matcher(palabra).matches()) {

                palabra = "(VERBO)";
                textoNuevo = textoNuevo + palabra + " ";
            } else {
                textoNuevo = textoNuevo + palabra + " ";
            }
        }
        return textoNuevo;
    }

}
