import data.CocheDAOImpl;
import data.MotoDAOImpl;
import model.Coche;
import model.Moto;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        //BASE DE DATOS

        DBConnection.createDatabase();

       //COCHES
        CocheDAOImpl cocheDAO = new CocheDAOImpl();
        Coche coche1 = new Coche("7263 CPR", "Nissan", "Qascai", "2019", 4);
        Coche coche2 = new Coche("4576 REH", "Renault", "Meganne", "2011", 4);
        Coche coche3 = new Coche("8745 UIJ", "Mercedes", "Benz", "2020", 4);

        //Insertar en la BD
        cocheDAO.insert(coche1);
        cocheDAO.insert(coche2);
        cocheDAO.insert(coche3);

        //Mostrar coches

        ArrayList<Coche> coches = cocheDAO.get();
        for (Coche c : coches) {
            System.out.println(c);
        }
        //Eliminar
        cocheDAO.delete(coche2);

        //Mostrar coches
        ArrayList<Coche> coches2 = cocheDAO.get();
        for (Coche c : coches2) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println();

        //MOTOS
        MotoDAOImpl motosDAO = new MotoDAOImpl();
        Moto moto1 = new Moto("7046 JKG", "Mitsubishi", "aaa", "2020", "MOLON");
        Moto moto2 = new Moto("8745 UIJ", "YAMAHA", "bbb", "2021", "nose");
        Moto moto3 = new Moto("1239 UIJ", "Kawasaki", "ccc", "2013", "aaaaa");

        //Insertar motos
        motosDAO.insert(moto1);
        motosDAO.insert(moto2);
        motosDAO.insert(moto3);

        //Mostrar motos
        ArrayList<Moto> motos = motosDAO.get();
        for (Moto m : motos) {
            System.out.println(m);
        }

        System.out.println();

        //Eliminar motos
        motosDAO.delete(moto1);

        //Mostrar motos
        ArrayList<Moto> motos2 = motosDAO.get();
        for (Moto m : motos2) {
            System.out.println(m);
        }
    }
}