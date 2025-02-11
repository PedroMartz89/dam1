/*
 * 
 * Escribe un programa simple que utilice un array (vector) de 10 elementos de números enteros e inicialice cada elemento con el valor 7 en cada elemento.
 * 
 * Pedro Martínez Sánchez
 * 
 */

public class Array1 {
    
    public static void main(String[] args) {
        
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = 7;
        }

        System.out.println("Array: ");

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Valor en la posición " + i + ": "+ array[i]);
        }

    }
}
