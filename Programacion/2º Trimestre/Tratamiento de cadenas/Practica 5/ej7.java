public class ej7 {
    public static void main(String[] args) {

        String texto = "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
        String terminos = "JVM,Java,Oracle";

        System.out.println(remplazarPalabras(texto, terminos));
    }

    public static String remplazarPalabras(String texto, String terminos) {

        String[] terminosArray = terminos.split(",");
        String[] textoArray = texto.split(" ");
        StringBuilder nuevoTexto = new StringBuilder();

        for (String termino : terminosArray) {

            StringBuilder asterisco = new StringBuilder();

            for (int i = 0; i < termino.length(); i++) {
                asterisco.append("*");
            }

            texto = texto.replaceAll(termino, asterisco.toString());
            asterisco=null;
        }

        return texto;
    }
}
