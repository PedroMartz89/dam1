package documentos.RRHH;

import documentos.Documento;

public class CV extends Documento {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String titulacion;
    private boolean coche;

    public CV(int numPaginas, String fechaCreacion, String nombre, String apellido1, String apellido2, String titulacion, boolean coche) {
        super(numPaginas, fechaCreacion);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.titulacion = titulacion;
        this.coche = coche;
    }

    @Override
    public void mostrarDocumento() {

        System.out.println(
                "\nNombre: " + this.nombre +
                "\nApellido 1: " + this.apellido1 +
                "\nApellido 2: " + this.apellido2 +
                "\nTitulación: " + this.titulacion +
                "\nTiene carnet de conducir?: " + this.coche);
    }
}
