public class Ej3 {
    public static void main(String[] args) {

        String cadena2 = "en";
        String cadena1 = "Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días";

        System.out.println("Número de veces que se repite en: " + obtenerNumeroVecesSubCadena(cadena1,cadena2));
    }

    public static int obtenerNumeroVecesSubCadena(String cadena1, String cadena2) {

        int contador = 0;

        for (int i = cadena1.indexOf(cadena2); i < cadena1.length(); i = cadena1.indexOf(cadena2, i + cadena2.length())) {

            contador++;
        }

        return contador;
    }
}
