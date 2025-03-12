public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaCompra = new ListaEnlazada();
        listaCompra.add("Leche");
        listaCompra.add("Miel");
        listaCompra.add("Aceitunas");
        listaCompra.add("Cerveza");
        listaCompra.add("Café");
        listaCompra.add(2, "Sal");
        System.out.println("Lista de la compra:");
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i));
        }
        System.out.println("\nLista de la compra ordenada:");
        listaCompra.ordenarBurbuja();
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i));
        }

        System.out.println("\nLista de la compra invertida: ");
        ListaEnlazada listaCompra2;
        listaCompra2 = listaCompra.invertirLista(listaCompra);
        for (int i = 0; i < listaCompra2.size(); i++) {
            System.out.println(listaCompra2.get(i));
        }

        System.out.println("\nElementos en la lista: " + listaCompra.size());
        System.out.println("Total de elementos: " + listaCompra.contarProductos(listaCompra));
        System.out.println("Elemento 3 en la lista: " + listaCompra.get(3));
        System.out.println("Posición del elemento Miel: " + listaCompra.indexOf("Miel"));
        System.out.println("Eliminado: " + listaCompra.remove("Miel"));
        listaCompra.add("Flan de café");
        System.out.println("Eliminar elementos que contienen café: ");
        listaCompra.eliminarPalabraClave("café", listaCompra);
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i));
        }
    }

}