public class Nodo {

    private Object producto;
    Nodo siguiente;

    public Nodo(Object dato) {
        this.producto = dato;
        this.siguiente = null;
    }

    public Nodo getSiguiente() {

        return siguiente;
    }

    public Object getProducto() {
        return producto;
    }
}
