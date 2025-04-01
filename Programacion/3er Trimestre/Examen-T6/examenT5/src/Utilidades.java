public class Utilidades {

    public static String validarNif(String nif) {
        if (nif.matches("^[0-9]{8}[A-Za-z]$")) {

            return nif;

        } else {

            return "12345678Z";
        }
    }

    public static String validarEmail(String email) {
        if (email.matches("^[\\w.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {

         return email;

        } else {

            return "sin email";
        }
    }

    public static String validarTelefono(String telefono) {
        if (telefono.matches("^\\d{3} \\d{3} \\d{3}$")) {

            return telefono;

        } else {
            return "000 000 000";
        }
    }

    public static boolean validarFecha(String fecha) {
        return fecha.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$");
    }

    public static String validarMatricula(String matricula) {
        if (matricula.matches("^[0-9]{4} [BCDFGHJKLMNPRTVWXYZ]{3}$")) {

            return matricula;
        } else {

            return "1234 BCD";
        }
    }

    public static String validarDescuento(String descuento) {
        if (descuento.matches("^\\d+(\\.\\d+)?$")) {

            return descuento;
        } else {

            return "1";
        }
    }

}