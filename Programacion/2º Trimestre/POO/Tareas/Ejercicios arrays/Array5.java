/*
 * 
 * Escribe un método que se llame buscarInt() que recibe un vector de enteros y un valor a buscar dentro del vector. Devuelve el índice de la primera ocurrencia dentro del vector proporcionado.
 * 
 * Pedro Martínez Sánchez
 * 
 */


public class Array5 {

    public static void main(String[] args) {
        
        int[] array = {3, 2, 3, 4, 7, 2, 4};

        System.out.println("El índice de la primera ocurrencia de 4 es: " + buscarInt(array, 4));

    }

    public static int buscarInt(int[] array, int valor) {

        int indice = 0;

        for (int i : array) {

            if (array[i] == valor) {

                indice = i;
                break;

            }
        }

        return indice;
    }
    
}
