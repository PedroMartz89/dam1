import java.util.ArrayList;

public class Pedido {

    private Tienda tienda;
    private ArrayList<Producto> productos;

    public Pedido(Tienda tienda, ArrayList<Producto> productos) {
        this.tienda = tienda;
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "\n  Tienda: " + tienda +
                "\n  Productos: " + productos;
    }
}
