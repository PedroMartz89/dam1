package documentos;

public class PedidoUrgente extends Pedido {

   private String tipoUrgencia;

    public PedidoUrgente(int numPaginas, String fechaCreacion, String idPedido, String fechaPedido, boolean recibido, String tipoUrgencia) {
        super(numPaginas, fechaCreacion, idPedido, fechaPedido, recibido);
        this.tipoUrgencia = tipoUrgencia;
    }



}
