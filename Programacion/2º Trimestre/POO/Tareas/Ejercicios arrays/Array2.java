/*
 * 
 * Escribe un programa simple que utilice un array (vector) de 20 elementos de números enteros e inicialice cada elemento con un valor igual al índice correspondiente del elemento, multiplicado por 5.
 * 
 * Pedro Martínez Sánchez
 * 
 */

public class Array2 {
    
    public static void main(String[] args) {
        
        int[] array = new int[20];
    
        for (int i = 0; i < 10; i++) {
            array[i] = i*5;
        }
    
        System.out.println("Array: ");
    
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Valor en la posición " + i + ": "+ array[i]);
        }
    }
}
