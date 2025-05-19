package datos;

import modulo.Producto;
import utils.BDConection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO{
    @Override
    public List<Producto> getProductosMinPrecio(double precioMin) {

        ArrayList<Producto> productos = new ArrayList<>();
        try {
            Connection conn = BDConection.getInstance();

            String sql = "SELECT nombre, precio, (select nombre from fabricante f where f.id = id_fabricante) as fabricante from producto " +
                    "where precio >= ? " +
                    "order by precio asc";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, precioMin);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                double euros = rs.getDouble("precio");
                String fabricante = rs.getString("fabricante");

                productos.add(new Producto(nombre, euros, fabricante));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productos;

    }

    @Override
    public List<Producto> getProductosNombre(String nombreProduct) {
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            Connection conn = BDConection.getInstance();

            String sql = "SELECT nombre, precio, " +
                    "(Select nombre from fabricante f where f.id = id_fabricante) as fabricante " +
                    "from producto " +
                    "where nombre Regexp ? ";


            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "."+ nombreProduct + ".");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                double euros = rs.getDouble("precio");
                String fabricante = rs.getString("fabricante");

                productos.add(new Producto(nombre, euros, fabricante));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productos;

    }

//    @Override
//    public void addProduct(Producto producto) {
//        try {
//            Connection conn = BDConection.getInstance();
//            String query = "insert into producto(nombre, precuo, id_fabricante) values(?,?,?)";
//
//            PreparedStatement prst = conn.prepareStatement(query);
//            prst.setString(1, producto.getNombre());
//            prst.setDouble(2, producto.getPrecio());
//            prst.setInt(3, producto.getFabricante());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

//    @Override
//    public void delProduct(String nombre) {
//
//    }
}
