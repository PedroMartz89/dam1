public class Nodo {

    Object dato;
    Nodo siguiente;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}
