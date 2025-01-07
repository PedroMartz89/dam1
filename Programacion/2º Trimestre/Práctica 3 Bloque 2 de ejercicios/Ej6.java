import java.util.Scanner;
public class Ej6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        rombo(numero);

        }

    

    public static void rombo(int num) {
        
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num-1; j++) {
                System.out.print(" ");
            }
        }

        for (int k = 0; k <= num; k++) {
            System.out.print("*");            
        }
        System.out.println();
    }
}