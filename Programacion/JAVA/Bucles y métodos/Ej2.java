import java.util.Scanner;

public class Ej2 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      double a, b, result = 0;
      String opcion;

      System.out.print("\nIntroduce el primer número del rango: ");
      a = teclado.nextDouble();

      System.out.print("\nIntroduce el segundo número del rango: ");
      b = teclado.nextDouble();
      teclado.nextLine();

      System.out.println("¿Qué valores quieres sumar?");
      System.out.println("Suma --> +");
      System.out.println("Resta --> -");
      System.out.println("Multiplicar --> *");
      System.out.println("Dividir --> /");
      System.out.print("\nOpción elegida: ");
      opcion = teclado.nextLine();
   
      switch (opcion) {
         case "+":
            result = Suma(a, b);
            break;

         case "-":
            result = Resta(a, b);
            break;

         case "*":
            result = Mult(a, b);
            break;
                
         case "/":
            result = div(a, b);
            break;

         default:
            System.out.println("Opción no válida.");
            break;
      }
    
      System.out.printf("El resultado de la operación %.2f %s %.2f es: %.2f\n", a, opcion, b, result);
      
      System.out.println();
   }

   static double Suma(double a, double b) {
      return a + b;
   }

   static double Resta(double a, double b) {
      return a - b;
   }

   static double Mult(double a, double b) {
      return a * b;
   }

   static double div(double a, double b) {
      if (b == 0) {
         System.out.println("Error: No se puede dividir por cero.");
         return Double.NaN; 
      }
      return a / b;
   }
}
