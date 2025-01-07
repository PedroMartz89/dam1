import java.util.Scanner;

public class Taller3 {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int numero;
       String caracter;

       System.out.print("Introduce un número entero: ");
       numero = teclado.nextInt();

       System.out.print("\nIntroduce un caracter: ");
       caracter = teclado.nextLine();
       result = muestraCuadrado(numero, caracter);
    }

    public static void muestraCuadrado(int num, String caracter) {

        for (int i = 1; i < 10; i++) {
            System.out.print(caracter);
            if (i != num && i != 1) {
                System.out.print(" ");
            }
        }

    }
}
