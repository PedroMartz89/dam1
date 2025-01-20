public class Libro {

    private String titulo;
    private String autor;
    private String editorial;
    private int ISBN;

        public Libro(String titulo, String autor, String editorial, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getISBN() {
        return ISBN;
    }

    public int setISBN(int ISBN) {
       return this.ISBN = ISBN;
    }

    public String detalleLibro() {

        String texto = "";

        return texto = "Título: "+ this.titulo
                + "\nAutor: " + this.autor
                + "\nEditorial: " + this.editorial
                + "\nISBN: " + this.ISBN;

    }

}
