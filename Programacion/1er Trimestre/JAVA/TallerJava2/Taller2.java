import java.util.Scanner;

public class Taller2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número entero: ");
        numero = teclado.nextInt();

        trianguloTexto(numero);

    
    }


    public static void trianguloTexto(int num) {

        for (int i = 0; i < num/2+1; i++) {
            
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
                
          
            }
            
            
            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println();
        }

        for (int i = num/2-1; i >= 0; i--) {
            
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
                
          
            }
            
            
            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println();
        }
    }
}