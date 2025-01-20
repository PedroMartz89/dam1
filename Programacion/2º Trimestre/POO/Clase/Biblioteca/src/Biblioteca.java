import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }


    public void altaLibro(Libro libro){

        libros.add(libro);
    }

    public String buscaLibroAut(String autor) {

        String texto="";

        for (Libro libroAux: libros) {

            if (libroAux.getAutor().equalsIgnoreCase(autor)) {

                texto=libroAux.detalleLibro();
            }

        }
            return texto;
    }

    public void eliminarLibro(int isbn) {

        for (int i = 0; i < libros.size(); i++) {

            if (libros.get(i).getISBN() == isbn) {

                libros.remove(i);

                break;
            }
        }
    }
}
