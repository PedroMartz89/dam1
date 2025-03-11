/**
 * Representa la estructura de un nodo para una lista dinámica con enlace simple.
 */
class Nodo {
    // Atributos
    Object dato;
    Nodo siguiente;

    /**
     * Constructor que inicializa atributos por defecto.
     *
     * @param - el elemento de información útil a almacenar.
     */
    public Nodo(Object dato) {
        this.dato = dato;
        siguiente = null;
    }

} // class