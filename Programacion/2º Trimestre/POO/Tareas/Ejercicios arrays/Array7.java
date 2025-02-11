
/*
 * 
 * Escribe un método que se llame contarIntConsecutivos() que recibe un vector de enteros. Devuelve cuantos valores -entre sus elementos- están ordenados. Si  todos los elementos son diferentes devuelve 0.
 * 
 * Pedro Martínez Sánchez
 * 
 */

public class Array7 {
    public static void main(String[] args) {
        int[] array1 = {3, 5, 3, 4, 5, 5, 4};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int[] array3 = {10, 9, 8, 7, 6};
        int[] array4 = {5, 10, 15, 20};

        System.out.println("Valores consecutivos en array1: " + contarIntConsecutivos(array1));
        System.out.println("Valores consecutivos en array2: " + contarIntConsecutivos(array2));
        System.out.println("Valores consecutivos en array3: " + contarIntConsecutivos(array3));
        System.out.println("Valores consecutivos en array4: " + contarIntConsecutivos(array4));
    }

    public static int contarIntConsecutivos(int[] array) {
        
        int max = 0;
        int contador = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                contador++;
            } else {
                max = Math.max(max, contador);
                contador = 0;
            }
        }
        return Math.max(max, contador);
    }
}
