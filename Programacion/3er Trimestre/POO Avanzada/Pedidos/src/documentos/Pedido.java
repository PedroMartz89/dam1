package documentos;

public class Pedido extends Documento{

    private String IdPedido;
    private String fechaPedido;
    private boolean recibido;

    public Pedido(int numPaginas, String fechaCreacion, String idPedido, String fechaPedido, boolean recibido) {
        super(numPaginas, fechaCreacion);
        IdPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.recibido = recibido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "IdPedido='" + IdPedido + '\'' +
                ", fechaPedido='" + fechaPedido + '\'' +
                '}';
    }

    @Override
    public void mostrarDocumento() {
        System.out.println(
                "\nID factura: " + this.IdPedido +
                        "\nFecha: " + this.fechaPedido +
                        "\nRecibido?: " + recibido);
    }
}
