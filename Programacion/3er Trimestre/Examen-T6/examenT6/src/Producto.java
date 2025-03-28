public class Producto {

    private String tipo;
    private String descripcion;
    private int cantidad;

    public Producto(String tipo, String descripcion, int cantidad) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\n   Nombre: " + tipo +
                "\n   Cantidad: " + cantidad +
                "\n";
    }
}
