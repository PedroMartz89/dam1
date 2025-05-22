package dao;

import model.Moto;
import model.Vehiculo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MotoDAO {

    void insert(Moto m) throws SQLException;
    void delete(Moto m) throws SQLException;
    ArrayList<Moto> get() throws SQLException;

}
