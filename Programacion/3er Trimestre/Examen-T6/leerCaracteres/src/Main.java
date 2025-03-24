import java.sql.Array;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        ej1List(frase);
    }

    public static void ej1List(String s) {

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);
            stack.push(String.valueOf(caracter));
        }

        for (int i = stack.size() -1; i >= 0 ; i--) {

            System.out.print(stack.pop());
        }
    }

}