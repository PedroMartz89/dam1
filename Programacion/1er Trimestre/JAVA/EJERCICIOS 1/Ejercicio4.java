import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double num1;
            double area;
            double longi;
            double esfera;

            System.out.print("Introduce el radio: ");
            num1 = teclado.nextInt();

            area = 2 * Math.PI * num1;
            longi = 2 * num1 * Math.PI;
            esfera = 4 / 3 * Math.PI * Math.pow(num1, 3);

            System.err.println("El área es: " + area);
            System.err.println("La longitud de la circunferencia es: " + longi);
            System.err.println("El volumen de la esfera es: " + esfera);
        }
    }
}
