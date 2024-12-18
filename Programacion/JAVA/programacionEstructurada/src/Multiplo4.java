import java.util.Scanner;

public class Multiplo4 {
    public static void main(String[] args) {

        mostrarMultiplos2(pedirTope());
        
    }

    public static int pedirTope(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el tope: ");
        int tope = teclado.nextInt();
        teclado.close();
        return tope;
    }

    public static void mostrarMultiplos2(int tope) {
        int mult  ;							// Almacena el múltiplo calculado
        int cont  ;							// Contador utilizado en el cálculo

        // Inicializa las variables
        mult = 0 ;
        cont = 0 ;
        System.out.println("\t Múltiplos de 2\n");
        while (mult < tope)					// Bucle de cálculo y visualización
        {
            mult = cont * 2;
            System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
            ++cont;
        }
        
        
    }

    
}
