package datos;

import modulo.Producto;

import java.util.List;

public interface ProductoDAO {

    List<Producto> getProductosMinPrecio(double precioMin);
    List<Producto> getProductosNombre(String nombre);
//    void addProduct(Producto producto);
//    void delProduct(String nombre);
}
