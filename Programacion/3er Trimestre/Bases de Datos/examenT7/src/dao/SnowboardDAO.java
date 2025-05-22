package dao;

import model.Snowboard;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SnowboardDAO {

    void addSnowboard(Snowboard s) throws SQLException;
    void deleteSnowboard(Snowboard s) throws SQLException;
    void updateSnowboard(Snowboard s);
    ArrayList<Snowboard> getAllSnowboards() throws SQLException;

}
