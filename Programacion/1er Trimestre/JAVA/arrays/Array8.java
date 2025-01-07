import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        
        int[] array = new int[10];
        int valor;
        try (Scanner teclado = new Scanner(System.in)) {
            boolean encontrado = false;
            
            for (int i = 0 ; i < array.length ; i++) {
                
                System.out.print("Introduce un valor al array -->  ");
                array[i] = teclado.nextInt();
                
            }
            
            System.out.print("Introduce un valor para saber si está en el array --> ");
            valor = teclado.nextInt();
            
            for (int i = 0 ; i < array.length ; i++) {
                
                if (array[i] == valor) {
                    System.out.printf("\nEl elemento %d del está en la posición %d ",valor, i);
                    encontrado = true;
                }
            }
            System.out.println("");
            if(!encontrado){
                
                System.out.printf("El elemento %d no está en el array. \n",valor);
            }
        }
    }
}