public class Main {
    public static void main(String[] args) {
        ListaCompra listaCompra = new ListaCompra();

        listaCompra.add("Macarrones");
        listaCompra.add("Cebollas");
        listaCompra.add("Miel");
        listaCompra.add("Ajos");
        listaCompra.add("Cerveza");

        listaCompra.mostrarLista();

        System.out.println("Buscar posición del producto miel: " + listaCompra.buscarProducto("Miel"));
        System.out.println("Eliminar producto miel de la lista" + listaCompra.removeIndexOf("Miel"));
        listaCompra.mostrarLista();

    }
}