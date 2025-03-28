import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        ArrayList<Tienda> tiendas;
        tiendas = tienda.anadirTiendas();

        ArrayList<Pedido> pedidos = crearPedidos(tiendas);

        Almacen almacen = new Almacen(pedidos);

        System.out.println("Procesando pedidos en el almacén: ");
        almacen.procesarPedido();

    }

    //Metodo que crea los pedidos en un ArrayList que devuelve
    public static ArrayList<Pedido> crearPedidos(ArrayList<Tienda> tiendas) {

        ArrayList<Pedido> pedidos = new ArrayList<>();

        for (Tienda tienda : tiendas) {
            ArrayList<Producto> productosAux = crearProductoRandom();
            pedidos.add(new Pedido(tienda, productosAux));

        }

        return pedidos;
    }

    //Metodo que crea productos de forma aleatoria y devuelve un array con ellos
    public static ArrayList<Producto> crearProductoRandom() {
        ArrayList<Producto> productos = new ArrayList<>();
        String[] nombreProductos = new String[7];
        nombreProductos[0] = "camiseta";
        nombreProductos[1] = "pantalón";
        nombreProductos[2] = "falda";
        nombreProductos[3] = "chándal";
        nombreProductos[4] = "calcetines";
        nombreProductos[5] = "top";
        nombreProductos[6] = "zapatillas";

        //No he conseguido hacer que me cree siempre 1 o más productos, a veces no crea ninguno
        int numProductos = (int)(Math.random() * 3);
        for (int i = 0; i < numProductos; i++) {
            int productoRandom = (int) (Math.random() * nombreProductos.length);
            int cantidadRandom = (int) (Math.random() * 20);
            productos.add(new Producto(nombreProductos[productoRandom], nombreProductos[productoRandom], cantidadRandom));
        }

        return productos;
    }
}