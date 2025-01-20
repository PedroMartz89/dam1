import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    Biblioteca biblioteca = new Biblioteca("Biblioteca1");

    Libro libro1 = new Libro("Casa Negra","Stephen King","SM",97823222);
    Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "Sintesis", 921421142);

    biblioteca.altaLibro(Libro libro2);
}