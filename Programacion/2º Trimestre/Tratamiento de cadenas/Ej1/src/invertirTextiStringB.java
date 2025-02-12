public class invertirTextiStringB {
    public static void main(String[] args) {

        System.out.println(invertirTexto("Introducción"));
    }

    public static String invertirTexto(String cadena) {
        StringBuilder s = new StringBuilder(cadena);

        return s.reverse().toString();
    }
}
