/*
 * Ejercicio2.java
 * Escribe un programa simple Java que calcule el área de un cuadrado cuyo lado se introduce por teclado
 * Autor: Pedro Martínez Sánchez
 * 25/11/24
 */


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            int lado;
            int total;
            
            System.out.println("Introduce el lado del cuadrado: ");
            lado = teclado.nextInt();
            
            total = lado * lado;
            
            System.out.println("El área del cuadrado es: " + total);
        }
    }
}
