package datos;

import modulo.Producto;
import utils.BDConection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO{
    @Override
    public List<Producto> getProductos() {

        ArrayList<Producto> productos = new ArrayList<>();
        try {
            Connection conn = BDConection.getInstance();
            Statement stmt = conn.createStatement();

            String sql = "SELECT p.nombre, p.precio FROM producto p join fabricante f on p.id_fabricante = f.id";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String nombre = rs.getString("nombre");
                double euros = rs.getDouble("precio");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productos;

        return List.of();
    }
}
