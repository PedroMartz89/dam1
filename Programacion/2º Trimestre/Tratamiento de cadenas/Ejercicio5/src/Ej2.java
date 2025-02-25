public class Ej2 {
    public static void main(String[] args) {

        String cadena = "((a + b) / 5-d) ";
        String cadena2 = ")(a + b))  ";

        System.out.println(parentesisCorrectos(cadena));
        System.out.println(parentesisCorrectos(cadena2));
    }

    public static boolean parentesisCorrectos(String cadena) {

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == '(') {

                contador++;

            } else if (cadena.charAt(i) == ')') {
                contador--;
            }
        }

        if (contador == 0) {
            return true;
        }

        return false;
    }
}
