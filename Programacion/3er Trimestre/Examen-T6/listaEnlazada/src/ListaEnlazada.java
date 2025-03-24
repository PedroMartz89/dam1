public class ListaEnlazada {

    private Nodo primero;
    private int numElementos;

    public ListaEnlazada() {
        this.primero = null;
        this.numElementos = 0;
    }

    // Metodo para obtener un nodo a través de un indice
    public Nodo getNodo(int indice) {

        Nodo actual = primero;
        if (indice >= 0 && indice < numElementos) {

            for (int i = 0; i < indice; i++) {

                actual = actual.siguiente;
            }

        }
            return actual;
    }


    // Metodo para añadir un nuevo nodo
    public void add(Object dato) {

        Nodo nuevo = new Nodo(dato);

        if (numElementos == 0) {
            primero = nuevo;

        } else {

            Nodo ultimo = getNodo(numElementos - 1);
            ultimo.siguiente = nuevo;
        }
        numElementos++;
    }
    //Metodo que elimina el
    public Object removePrimero() {

        Nodo actual = primero;
        primero = primero.siguiente;
        numElementos --;
        return actual;
    }

    public Object removeIntermedio(int indice) {


        Nodo anterior = getNodo(indice-1);
        Nodo actual = anterior.siguiente;
        anterior.siguiente = actual.siguiente;
        numElementos--;

        return actual.dato;
    }

    public void remove(int indice) {

        if (indice >= numElementos || indice < 0) {
            System.out.println("índice incorrecto");
        }

        if (indice == 0) {

            removePrimero();
            return;
        }

        if (indice > 0) {

            removeIntermedio(indice);
        }
    }

    public int removeIndexOf(Object dato) {
        int actual = indexOf(dato);

        if (actual != -1) {

            remove(actual);

        }

        return actual;
    }

    public int indexOf(Object dato) {

        Nodo actual = primero;

        for (int i = 0; actual != null; i++) {

            if (actual.dato != null && actual.dato.equals(dato) || actual.dato == dato) {

                return i;
            }

            actual = actual.siguiente;
        }

        return -1;
    }

    public Object getDato(int indice) {

        Nodo actual = null;

        if (indice < 0 || indice >= numElementos) {

            System.out.println("El indice es incorrecto");

        } else {

            actual = getNodo(indice);
        }

        assert actual != null;
        return actual.dato;
    }

    public int size() {

        return numElementos;
    }
}
