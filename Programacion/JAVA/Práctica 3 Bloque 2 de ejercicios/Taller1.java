import java.util.Scanner;

public class Taller1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int horasTrabajadas, salario, temp;
        boolean seguir = false;

        do { 

            System.out.print("Introduce las horas trabajadas: ");
            horasTrabajadas = teclado.nextInt();
            salario = calcularSalario(horasTrabajadas);

            System.out.println("El salario total es de: " + salario);

            System.out.println("Quiere calcular otro salario?: 0 -- Sí 1 -- No");
            temp = teclado.nextInt();
            if (temp == 0) {

                seguir = true;

            
            } 

            if (temp == 1) {

                seguir = false;

            }
            
        } while(seguir == true);
    

    }


    public static int calcularSalario(int horas) {

        int temporal = 0;
        int total = 0;

        if (horas <= 35) {

            total = 15 * 35;

        } else if(horas > 35) {

            temporal = horas - 35;
        }

        return (35 * 15 + temporal * 22);
    }
}
