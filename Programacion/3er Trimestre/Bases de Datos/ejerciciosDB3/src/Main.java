import datos.ProductoDAO;
import datos.ProductoDAOImpl;
import modulo.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre de producto: ");
        String nombre = sc.nextLine();

        List<Producto> productos = dao.getProductosNombre(nombre);

        System.out.println("---- Productos ----");
        for (Producto producto : productos) {

            System.out.println(producto);
            System.out.println("--------------------------------------------------------");
        }
    }
}
