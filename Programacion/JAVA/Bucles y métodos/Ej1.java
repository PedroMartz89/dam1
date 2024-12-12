
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        boolean correcto = false;

        while (correcto == false) {
            System.out.print("\nIntroduce el primer número del rango: ");
            a = teclado.nextInt();

            System.out.print("\nIntroduce el segundo número del rango: ");
            b = teclado.nextInt();

            System.out.println("¿Qué valores quieres sumar? 0 -- Pares 1 -- Impares ");
            c = teclado.nextInt();

            if (a < b && c >= 0 && c <= 1) {
                
                correcto = true;
                mostrarSuma(a, b, c);
            } else {

                System.out.println("Los valores introducidos no son correctos, vuelva a intentarlo.");
                System.out.println();
            }
        } 

    }

    static void mostrarSuma(int a ,int b, int c) {

        int total = 0;

        if (c == 0) {
            
            for (int i = a; i < b ; i = i + 2) {
           
                total = total + i;
           }
           System.out.println("La suma de los pares es: "+ total);

        } else {

            if (c == 1) {
                
                for (int i = a+1; i < b ; i = i + 2) {
           
                    total = total + i;
               }

               System.out.println("La suma de los impares es: "+ total);
            }
        }
       


    }

}