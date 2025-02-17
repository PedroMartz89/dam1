public class Libro {

    private String nombre;
    private String autor;
    private String genero;
    private int ano;
    private int isbn;
    private String editorial;
    private String sinopsis;

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", año=" + ano +
                ", isbn=" + isbn +
                ", editorial='" + editorial + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                '}';
    }

    public Libro(String nombre, String autor, String genero, int ano, int isbn, String editorial, String sinopsis) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.isbn = isbn;
        this.editorial = editorial;
        this.sinopsis = sinopsis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
