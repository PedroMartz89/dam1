public class ListaEnlazada {

    Nodo primero;
    int numElementos = 0;

    public ListaEnlazada() {
        this.primero = null;
        this.numElementos = 0;
    }

    public Nodo getNodo(int indice) {

        Nodo actual = primero;

        for (int i = 0; i < indice; i++) {

            actual = actual.siguiente;
        }

        return actual;
    }

    public boolean add(Object dato) {

        Nodo nuevo = new Nodo(dato);

        if (numElementos == 0) {

            primero = nuevo;
            numElementos++;
            return true;
        } else {
            Nodo ultimo = getNodo(numElementos - 1);
            ultimo.siguiente = nuevo;
            numElementos++;
            return true;
        }
    }

    public void remove(int indice) {

        assert indice >= 0 && indice < numElementos;

        if (indice == 0) {

            removePrimero();

        } else if (indice == numElementos - 1) {

            removeUltimo(indice);

        } else {

            removeIntermedio(indice);
        }

        numElementos--;
    }

    public void removePrimero() {

        primero = primero.siguiente;
    }

    public void removeUltimo(int indice) {

        Nodo anterior = getNodo(indice - 1);
        anterior.siguiente = null;

    }

    public void removeIntermedio(int indice) {

        Nodo actual = getNodo(indice);
        Nodo anterior = getNodo(indice-1);

        anterior.siguiente = actual.siguiente;

    }

    public int indexOf(Object dato) {

        for (int i = 0; i < numElementos; i++) {

            if (dato.equals(getNodo(i).getDato())) {

                return i;
            }
        }

        return -1;
    }

    public void remove(Object dato) {

        int indice = indexOf(dato);
        remove(indice);
    }

    public int size() {
        return numElementos;
    }

    public Object getDato(int indice) {

        Nodo actual = primero;

        for (int i = 0; i < indice ; i++) {

            actual = actual.siguiente;
        }

        return actual.dato;
    }
}
