
import java.util.Scanner;

/*
 * Ejercicio2.java
 * 
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            int num1;
            int num2;

            System.out.print("Introduce el primer número: ");
            num1 = teclado.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = teclado.nextInt();
            
            System.out.println("La suma de "+ num1 + " + " + num2 + " = " + (num1+num2));
            System.out.println("La resta de "+ num1 + " - " + num2 + " = " + (num1-num2));
            System.out.println("La multiplicación de "+ num1 + " * " + num2 + " = " + (num1*num2));
            double i = num1;
            double j = num2;
            System.out.println("La división de "+ num1 + " / " + num2 + " = " + (i / j));
        }
        
    }
}
