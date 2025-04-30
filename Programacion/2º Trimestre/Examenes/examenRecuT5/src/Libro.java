public class Libro {

    private String identificador;
    private String titulo;
    private String autor;
    private String isbn;
    private String prologo;
    private String numPaginas;
    private String precio;
    private String fechaEdicion;

    public Libro(String identificador, String titulo, String autor, String isbn, String prologo, String numPaginas, String precio, String fechaEdicion) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prologo = prologo;
        this.numPaginas = numPaginas;
        this.precio = precio;
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return identificador + " " + titulo + " - " + autor
                + "\nISBN: " + isbn
                + "\nSinopsis: " + prologo
                + "\nNº Páginas: " + numPaginas
                + "\nFecha de edición: " + fechaEdicion + " - " + "Precio: " + precio +"€";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPrologo() {
        return prologo;
    }

    public String getAutor() {
        return autor;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public String getPrecio() {
        return precio;
    }
}
