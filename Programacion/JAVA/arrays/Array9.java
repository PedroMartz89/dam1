
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[10];
        int contador = 1;
        int valor;

        for (int i = 0; i < 10; i++) {
            
            System.out.print("Introduce valores al array --> ");
            array[i] = teclado.nextInt();
        }

        while (contador != 0) {
            
            for (int i = 0; i < array.length; i++) {
                
                System.out.print("Introduce el valor a buscar en el array --> ");
                valor = teclado.nextInt();

            if (valor != 0) {
                    
                if (array[i] == valor) {
                        
                    System.out.printf("El valor %d está en la posición %d\n", valor, i);
                }

                } else {

                    contador = 0;
                }
            }

        }
        
    }
}
