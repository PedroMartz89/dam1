package documentos;

public abstract class Documento {
    private int numPaginas;
    private String fechaCreacion;

    public Documento(int numPaginas, String fechaCreacion) {
        this.numPaginas = numPaginas;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract void mostrarDocumento();

    public int getNumPaginas() {
        return numPaginas;
    }
}
