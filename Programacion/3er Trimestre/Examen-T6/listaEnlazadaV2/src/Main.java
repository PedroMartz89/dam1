public class Main {
    public static void main(String[] args) {
        System.out.println("----- Prueba de Lista Enlazada -----");
        ListaEnlazada listaCompra = new ListaEnlazada();

        listaCompra.add("Leche");
        listaCompra.add("Miel");
        listaCompra.add("Aceitunas");
        listaCompra.add("Cerveza");
        listaCompra.add("Café");

        System.out.println("Lista de la compra");
        System.out.println("---------------------");

        for (int i = 0; i < listaCompra.size(); i++) {

            System.out.println(listaCompra.getDato(i));
        }

        System.out.println("Número de elementos: " + listaCompra.size());
        System.out.println("Elemento número 3 de la lista: " + listaCompra.getDato(3));
        System.out.println("Posición del la miel en la lista: " + listaCompra.indexOf("Miel"));
        System.out.println("La miel ha sido eliminada de la lista: ");
        listaCompra.remove("Miel");
        System.out.println("Número de elementos: " + listaCompra.size());

        for (int i = 0; i < listaCompra.size(); i++) {

            System.out.println(listaCompra.getDato(i));
        }

        System.out.println("Elemento número 3 de la lista: " + listaCompra.getDato(3));

    }
}