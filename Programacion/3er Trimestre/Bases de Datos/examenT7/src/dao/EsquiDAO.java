package dao;

import model.Esqui;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EsquiDAO {

    void addEsqui(Esqui e) throws SQLException;
    void deleteEsqui(Esqui e) throws SQLException;
    void updateEsqui(Esqui e);
    ArrayList<Esqui> getAllEsquis() throws SQLException;
}
