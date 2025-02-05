
public class Main {
    public static void main(String[] args) {

        Cuenta cuent1 = new Cuenta(100001, 100000, 100);

        System.out.println("Método ingresar dinero");

        cuent1.ingresar(50.50);

        System.out.println(cuent1);

        System.out.println("Método retirar dinero");

        cuent1.retirar(100.50);

        System.out.println(cuent1);


    }
}