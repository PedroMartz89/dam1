/*
    
    Clase Ej5.java
    Escribe una clase java que pida que introduzcas un número entero entre 0 y 20, y muestre en pantalla una secuencia de números hasta el introducido (incluido), repitiendo cada número tantas veces como el valor que representa. Si introduces el 3, la salida será similar a ésta:

    1
    22
    333

    Autor: Pedro Martínez Sánchez

*/
import java.util.Scanner;

public class Ej6 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        int num;
        boolean condicion = false;
        Scanner teclado = new Scanner(System.in);

        while (!condicion) {

            System.out.print("Introduce un numero entre 0 y 20 --> ");
            num = teclado.nextInt();

            if (num >= 0) {
                
                condicion = true;

                for (int i = 1; i <= num ; i++ ) {
                    
                    for (int j = 1; j <= i; j++ ) {

                        System.out.print(i);
                    }

                    System.out.println();
                }
            }

        }
    }
}