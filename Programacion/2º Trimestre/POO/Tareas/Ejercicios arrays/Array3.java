/*
 * 
 * Escribe un método que se llame frecuenciaNumero() que recibe un vector de enteros y un número. Devuelve la frecuencia entre los elementos del vector del número recibido.
 * 
 * Pedro Martínez Sánchez
 * 
 */

public class Array3 {
    
    public static void main(String[] args) {
        
        int[] array = {2,4,5,7,8,9,6,5,5,5,4,1,2,1};

        System.out.println(frecuenciaNumero(array, 5));
        
    }


    public static int frecuenciaNumero(int[] array, int  num) {
        
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            
            if (array[i] == num) {
                
                contador++;
            }
        }

        return contador;
    }

}
