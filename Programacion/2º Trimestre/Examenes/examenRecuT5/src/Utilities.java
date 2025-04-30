

public class Utilities {

    public static boolean validarId(String id) {

        return id.matches("^[0-9]{2}-[A-Z]{3}$");
    }

    public static boolean validarISBN(String isbn) {

        return isbn.matches("^978[0-9]{10}$|^979[0-9]{10}$");
    }

    public static boolean validarPaginas(String paginas) {

        return paginas.matches("[1-9]*");
    }

    public static boolean validarPrecio(String precio) {

        return precio.matches("[1-9]*.[0-9]*");
    }

    public static boolean validarFecha(String fecha) {

        return fecha.matches("^[0-9]{2}/[01][12]/[1-9]{4}$");
    }
}
