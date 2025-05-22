package dao;

import model.Coche;
import model.Vehiculo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CocheDAO {

    void insert(Coche c);
    void delete(Coche c) throws SQLException;
    ArrayList<Coche> get() throws SQLException;


}
