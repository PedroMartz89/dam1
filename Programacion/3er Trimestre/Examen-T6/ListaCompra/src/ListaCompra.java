public class ListaCompra {

    private Nodo primero;
    private int numProductos;

    public ListaCompra() {
        this.primero = null;
        this.numProductos = 0;
    }

    public void add(Object producto) {

        Nodo nuevo = new Nodo(producto);

        if (numProductos == 0) {

            primero = nuevo;

        } else {

            Nodo ultimo = getNodo(numProductos - 1);
            ultimo.siguiente = nuevo;

        }
        numProductos++;
    }

    public void remove(int indice) {

        if (indice >= 0 && indice < numProductos) {

            if (indice == 0) {

                primero = primero.siguiente;
                numProductos --;

            } else if (indice == numProductos - 1){

               Nodo anterior = getNodo(indice - 1);

               anterior.siguiente = null;
               numProductos--;

            } else {

                Nodo actual = getNodo(indice);
                Nodo anterior = getNodo(indice - 1);

                anterior.siguiente = actual.siguiente;
                numProductos--;
            }
        }
    }

    public Nodo getNodo(int indice) {

        Nodo actual = primero;

        if (indice >= 0 && indice < numProductos) {

            for (int i = 0; i < indice ; i++) {

                actual = actual.siguiente;
            }
        }

        return actual;
    }

    public Object getProductoIn(int indice) {

        Nodo actual = primero;
        if (indice >= 0 && indice < numProductos) {

            for (int i = 0; i < indice; i++) {

                actual = actual.siguiente;
            }
        }

        return actual.getProducto();
    }
    public void mostrarLista() {

        System.out.println("---- Lista de la compra ----");
        for (int i = 0; i < numProductos; i++) {

            System.out.println("-" + getProductoIn(i));
        }

    }

    public int buscarProducto(Object producto) {

        Nodo actual = primero;

        for (int i = 0; i < numProductos; i++) {

            if (actual.getProducto().equals(producto)) {

                return i;

            } else {

                actual = actual.siguiente;
            }

        }

        return -1;
    }

    public int indexOf(Object producto) {

        Nodo actual = primero;

        for (int i = 0; i < numProductos; i++) {

            if (actual.getProducto().equals(producto)) {

                return i;

            } else {

                actual = actual.siguiente;
            }

        }

        return -1;
    }

    public Object removeIndexOf(Object producto) {

        int actual = indexOf(producto);
        remove(actual);

        return "\nEliminación correcta";
    }
}
