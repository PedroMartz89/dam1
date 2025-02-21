

public class expresionesV2 {

    public static void main(String[] args) {

        String texto = "010101010101";
        System.out.println(validarBinario(texto));
    }

    public static boolean validaNumEntero(String texto) {

        return texto.matches("^-?[0-9]+$");
    }

    public static boolean validaNumEnteroPositivo(String texto) {

        return texto.matches("^?[0-9]+$");
    }

    public static boolean validaNumEnteroNegativo(String texto) {

        //Así evitamos el -0

        return texto.matches("^-[1-9][0-9]*$");
    }

    public static boolean validaDNI(String texto) {


        return texto.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
        
    }

    public static boolean validaIP(String texto) {

        return texto.matches("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    }

    public static boolean validaMatricula(String texto) {

        return texto.matches("^[0-9]{4}[B-Z && [^AEIÑQOU]]{3}$");
    }

    public static boolean validarBinario(String texto) {

        return texto.matches("[01]+");
    }
}