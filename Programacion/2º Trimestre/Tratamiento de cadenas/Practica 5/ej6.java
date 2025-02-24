public class ej6 {

    public static void main(String[] args) {

        System.out.println("Salida: " + padRigth("hola", '*', 20));
    }

    public static String padRigth(String cadena, char caracter, int num) {

        if (num >= cadena.length()) {

            StringBuilder builder = new StringBuilder();
            builder.append(cadena);
            for (int i = cadena.length(); i <= num ; i++) {

                builder.append(caracter);
            }

            return builder.toString();

        } else {

            return cadena;
        }
    }
}
