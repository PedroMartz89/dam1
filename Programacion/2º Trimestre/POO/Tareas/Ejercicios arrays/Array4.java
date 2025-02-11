/*
 * 
 * Escribe un método que se llame vectoresIntIguales() que recibe dos vectores de enteros. Devuelve true si son iguales.
 * 
 * Pedro Martínez Sánchez
 * 
 */

public class Array4 {
    
    public static void main(String[] args) {
        
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        int[] array3 = {4,21,532,65,32,1,4};

        System.out.print("El array 1 y el array 2 son iguales?: ");
        System.out.println(vectoresIntIguales(array1, array2));
        System.out.print("El array 1 y el array 3 son iguales?: ");
        System.out.println(vectoresIntIguales(array1, array3));
    }   
    

    public static boolean vectoresIntIguales(int[] array1, int[] array2) {


        for (int i = 0; i < array1.length; i++) {
            
                
            if (array1.length != array2.length) {
                    
                return false;

            } 

            if (array1[i] != array2[i]) {
                        
                return false;
            }
        }

        return true;
    }

    
}
