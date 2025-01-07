/*
 * Ejercicio1.java
 * Escribe un programa que pida tu nombre y te salude
 * 25/11/24
 */

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            String nombre1;
            
            System.out.print("Introduce tu nombre: ");
            nombre1 = teclado.nextLine();
            
            System.out.println("Buenos días " + nombre1);
        }
    }
}