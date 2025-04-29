package documentos;

public class Factura extends Documento{

    private String IdFactura;
    private String fecha;

    public Factura(int numPaginas, String fechaCreacion, String idFactura, String fecha) {
        super(numPaginas, fechaCreacion);
        IdFactura = idFactura;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "IdFactura='" + IdFactura + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    @Override
    public void mostrarDocumento() {
        System.out.println(
                "\nID factura: " + this.IdFactura +
                "\nFecha: " + this.fecha +
                "\nNumero de páginas: "  + getNumPaginas()) ;
    }
}
