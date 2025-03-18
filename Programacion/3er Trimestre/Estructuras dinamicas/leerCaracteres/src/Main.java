import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la frase: ");
        String s = sc.nextLine();

        //Solucion con pila
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);
            pila.push(caracter);
        }

        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.print(pila.pop());
        }

    }
}