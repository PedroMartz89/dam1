
/*
 * 
 * Escribe un método que se llame yaOrdenadoInt() que recibe un vector de enteros. Devuelve true si está ordenado
 * 
 * Pedro Martínez Sánchez
 * 
 */

public class Array6 {

 public static void main(String[] args) {
    
    int[] array1 = {1, 2, 3, 4, 5, 6};
    int[] array2 = {3, 2, 3, 4, 7, 2, 4};
    int[] array3 = {5, 4, 3, 2, 1};
    
    System.out.println("Array1 está ordenado?: " + yaOrdenadoInt(array1));
    System.out.println("Array2 está ordenado?: " + yaOrdenadoInt(array2));
    System.out.println("Array3 está ordenado?: " + yaOrdenadoInt(array3));
}
    
    public static boolean yaOrdenadoInt(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
            return true;
    }    
}
