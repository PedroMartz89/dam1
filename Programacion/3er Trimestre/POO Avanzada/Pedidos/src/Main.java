import documentos.Documento;
import documentos.Factura;
import documentos.Pedido;
import documentos.PedidoUrgente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static Documento crearDocumento() {

    }

    public static void menu() {

        System.out.println("---- Introduce una opción para crear un documento ----");
        System.out.println("1 - Factura");
        System.out.println("2 - Pedido");
        System.out.println("3 - Pedido Urgente");
        System.out.println("4 - Contrato");
        System.out.println("5 - Currículum Vitae");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nElige una opción:");
        int option = sc.nextInt();

        switch (option) {

            case 1 -> crearFactura();
            case 2 -> crearPedido();
            case 3 -> crearPedidoUrgente();
            case 4 -> crearContrato();
            case 5 -> crearCurriculum();
        }


    }
    public static void crearFactura() {


    }

    public static void crearPedido() {


    }

    public static void crearPedidoUrgente() {

    }

    public static void crearContrato() {


    }

    public static void crearCurriculum() {

    }
}
