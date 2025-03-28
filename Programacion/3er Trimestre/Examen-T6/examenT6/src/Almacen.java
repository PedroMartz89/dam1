import java.util.ArrayList;

public class Almacen {

    private ArrayList<Pedido> colaPedidos;

    public Almacen(ArrayList<Pedido> pedidos) {
        colaPedidos = pedidos;
    }

    //Asumo que se pueden procesar 10 productos al día
    //Metodo que se encarga del procesado de pedidos
    public void procesarPedido() {

        int numProcesados = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Procesando pedido: ");
            System.out.println(colaPedidos.get(i).toString());

            System.out.println("PROCESADO\n");
            numProcesados++;
        }


        System.out.println("\nProductos procesados: " + numProcesados);
        System.out.println("\nProductos restantes: " + (colaPedidos.size() - numProcesados));

    }
}
