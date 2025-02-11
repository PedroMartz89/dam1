/*
 * 
 * Escribe un método que se llame masFrecuenteInt() que recibe un vector de enteros. Devuelve el valor del elemento más frecuente, si hay coincidencia devolvería el primero de ellos.
 * 
 * Pedro Martínez Sánchez
 * 
 */

public class Array8 {
    public static void main(String[] args) {
        int[] vector = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int resultado = masFrecuenteInt(vector);
        System.out.println("El valor más frecuente es: " + resultado);
    }


    public static int masFrecuenteInt(int[] vector) {

        int valorMasFrecuente = vector[0];
        int frecuenciaMaxima = 1;

        for (int i = 0; i < vector.length; i++) {
            int frecuenciaActual = 1;

            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    frecuenciaActual++;
                }
            }

            if (frecuenciaActual > frecuenciaMaxima) {
                frecuenciaMaxima = frecuenciaActual;
                valorMasFrecuente = vector[i];
            }
        }

        return valorMasFrecuente;
    }

}