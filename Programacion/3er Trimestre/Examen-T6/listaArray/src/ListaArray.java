public class ListaArray {

    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMANO_INICIAL = 4;

    public ListaArray() {
        arrayElementos = new Object[TAMANO_INICIAL];
        this.numElementos = 0;
    }

    public int size() {
        return numElementos;
    }

    public void comprobarLlenado() {

        if (numElementos + 1 == arrayElementos.length) {
            Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
            System.arraycopy(arrayElementos,0,arrayAmpliado,0,numElementos);
            arrayElementos = arrayAmpliado;
        }
    }

    public void add(Object elemento) {

        comprobarLlenado();
        if (numElementos == 0) {
            arrayElementos[0] = elemento;
        } else {

            arrayElementos[numElementos] = elemento;
        }
        numElementos++;
    }

    public void add(int indice, Object elemento) {

        if (indice >= numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
        }

        comprobarLlenado();

        if (indice < numElementos) {
            System.arraycopy(arrayElementos,indice,arrayElementos,indice+1,numElementos - indice);
        }
        arrayElementos[indice] = elemento;
        numElementos++;
    }

    public int indexOf(Object elemento) {

        if (elemento == null) {

            for (int i = 0; i < arrayElementos.length ; i++) {

                if (arrayElementos[i] == null) {

                    return i;
                }

            }
        } else

            for (int i = 0; i < arrayElementos.length ; i++) {

            if (elemento.equals(arrayElementos[i])) {

                return i;
            }

        }
        return -1;
    }

    public void clear() {

        arrayElementos = new Object[TAMANO_INICIAL];
        numElementos = 0;
    }

    public boolean contains(Object elemento) {
        return indexOf(elemento) != -1;
    }

    public Object get(int indice) {
        if (!(indice >= 0 && indice < numElementos)) {
            throw new IndexOutOfBoundsException("índice incorrecto");
        }
            return arrayElementos[indice];
    }

    public Object remove(int indice) {
        if (indice >= numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
        }

        Object elemento = arrayElementos[indice];
        System.arraycopy(arrayElementos,indice+1,arrayElementos,indice,numElementos - (indice+1));

        arrayElementos[numElementos-1] = null;
        numElementos--;
        return elemento;
    }

    public int remove(Object elemento) {
        int indice = indexOf(elemento);

        if (indice != - 1) {

            remove(indice);
        }

        return indice;
    }
}
