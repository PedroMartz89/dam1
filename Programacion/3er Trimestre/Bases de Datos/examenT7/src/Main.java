import dao.SnowboardDAO;
import data.EsquiDAOImpl;
import data.SnowboardDAOImpl;
import model.Equipamiento;
import model.Esqui;
import model.Snowboard;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        //Crear base de datos
        DBConnection.createDB();

        System.out.println("---- Esquís ----");
        //ESQUIS
        EsquiDAOImpl esquiDAO = new EsquiDAOImpl();
        Esqui esqui1 = new Esqui(1, "nose", "aleluya", 85, 2019, 4, "Disponible", 42, true);
        Esqui esqui2 = new Esqui(2, "oopa", "pizarra", 70.5, 2016, 9, "Alquilado", 39, false);
        Esqui esqui3 = new Esqui(3, "LOLITA", "suprem", 125.90, 2023, 2, "En reparación", 43, true);

        //Añadir esquis
        esquiDAO.addEsqui(esqui1);
        esquiDAO.addEsqui(esqui2);
        esquiDAO.addEsqui(esqui3);

        //Recuperar Esquis
        ArrayList<Esqui> esquisALL = esquiDAO.getAllEsquis();
        for (Esqui e : esquisALL) {
            System.out.println(e);
        }

        //Borrar esquis
        esquiDAO.deleteEsqui(esqui2);
        ArrayList<Esqui> esquisDel = esquiDAO.getAllEsquis();
        for (Esqui e : esquisDel) {
            System.out.println(e);
        }

        //SNOWBOARDS
        System.out.println("---- SNOWBOARDS ----");
        System.out.println();
        SnowboardDAOImpl snowboardDAO = new SnowboardDAOImpl();
        Snowboard snowb1 = new Snowboard(1, "superNieves", "extreme 2000", 60.87, 2016, 9, "Disponible", "Intermedio", false);
        Snowboard snowb2 = new Snowboard(2, "derriteHielo", "Extra confort", 120.89, 2024, 1, "Alquilado", "Profesional", true);
        Snowboard snowb3 = new Snowboard(3, "surfeaNieve", "Delizamiento optimo", 90.99, 2017, 12, "En reparación", "Principiante", false);

        //Añadir snowboards
        snowboardDAO.addSnowboard(snowb1);
        snowboardDAO.addSnowboard(snowb2);
        snowboardDAO.addSnowboard(snowb3);

        //Recuperar snowboards
        ArrayList<Snowboard> snowboards = snowboardDAO.getAllSnowboards();
        for (Snowboard s : snowboards) {
            System.out.println(s);
        }

        //Eliminar snowboard
        snowboardDAO.deleteSnowboard(snowb1);

        //Recuperar snowboards
        ArrayList<Snowboard> snowboardsDel = snowboardDAO.getAllSnowboards();
        for (Snowboard s : snowboardsDel) {
            System.out.println(s);
        }


        //Colección de Equipamiento

        ArrayList<Equipamiento> equipamientos = new ArrayList<>();
        equipamientos.add(esqui1);
        equipamientos.add(esqui2);
        equipamientos.add(esqui3);
        equipamientos.add(snowb1);
        equipamientos.add(snowb2);
        equipamientos.add(snowb3);

        for (Equipamiento e : equipamientos) {

            System.out.println("---- Equipamiento ----");
            System.out.println(e);
            System.out.println("Valor actual: " + e.valorActual());
        }

        int antiguedad = 0;
        int totalEquipo = equipamientos.size();
        for (Equipamiento e : equipamientos) {
            antiguedad = antiguedad + e.antiguedad();
        }

        int antiguedadMedia = antiguedad / totalEquipo;
        System.out.println("Antiguedad media del equipamiento: " + antiguedadMedia + " años.");


        System.out.println();
        System.out.println();
        System.out.println();

        while (true) {

            System.out.println("Menú de opciones, elija una acción a realizar: ");
            System.out.println("1 - Mostrar Equipamiento");
            System.out.println("2 - Añadir nuevo esquí");
            System.out.println("2 - Eliminar esquí");
            System.out.println("4 - Añadir nuevo snowboard");
            System.out.println("5 - Eliminar snowboard");
            System.out.println("0 - Salir");

            try {

                Scanner sc = new Scanner(System.in);
                int option = sc.nextInt();
                if (option == 0) {break;}
                menuGestionar(option);
                sc.close();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void menuGestionar(int option) throws SQLException {

        switch (option) {

            case 1 -> mostrarEquipamiento();
            case 2 -> nuevoEsqui();
            case 3 -> delEsqui();
            case 4 -> nuevoSnowboard();
            case 5 -> delSnowboard();
            default -> System.out.println("Introduce una de las opciones válidas");

        }
    }

    public static ArrayList<Equipamiento> getEquipo() throws SQLException {

        SnowboardDAOImpl snowboardDAO = new SnowboardDAOImpl();
        EsquiDAOImpl esquiDAO = new EsquiDAOImpl();

        ArrayList<Equipamiento> equipo = new ArrayList<>();
        ArrayList<Snowboard> snowboards = snowboardDAO.getAllSnowboards();
        ArrayList<Esqui> esquis = esquiDAO.getAllEsquis();

        equipo.addAll(snowboards);
        equipo.addAll(esquis);

        return equipo;
    }

    public static void mostrarEquipamiento() throws SQLException {

        ArrayList<Equipamiento> equipo = getEquipo();

        System.out.println("\n-----Equipo total -----");
        for (Equipamiento e : equipo) {
            System.out.println(e);
        }
    }

    public static void nuevoEsqui() throws SQLException {
        Scanner scInt = new Scanner(System.in);
        Scanner scBool = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        System.out.println("-- Introduce los datos del nuevo esquí --");

        System.out.print("Introduce el id: ");
        int id = scInt.nextInt();
        System.out.print("Introduce la marca: ");
        String marca = scString.nextLine();
        System.out.print("Introduce el modelo: ");
        String modelo = scString.nextLine();
        System.out.print("Introduce el valor de compra: ");
        double valorCompra = scDouble.nextDouble();
        System.out.print("Introduce el año de compra: ");
        int anioCompra = scInt.nextInt();
        System.out.print("Introduce el número de usos: ");
        int numUsos = scInt.nextInt();
        System.out.print("Introduce el estado: ");
        String estado = scString.nextLine();
        System.out.print("Introduce la talla: ");
        int talla = scInt.nextInt();
        System.out.print("Tiene fijaciones? (true/false): ");
        boolean fijaciones = scBool.nextBoolean();

        EsquiDAOImpl esquiDAO = new EsquiDAOImpl();

        esquiDAO.addEsqui(new Esqui(id, marca, modelo, valorCompra, anioCompra, numUsos, estado, talla, fijaciones));

        scString.close();
        scDouble.close();
        scInt.close();
    }

    public static void delEsqui() throws SQLException {
        EsquiDAOImpl esquiDAO = new EsquiDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué esquí quieres eliminar (Introduce el ID)? ");
        int id = sc.nextInt();

        ArrayList<Esqui> esquis = esquiDAO.getAllEsquis();
        for (Esqui e : esquis) {
            if (e.getId() == id) {
                esquiDAO.deleteEsqui(e);
                System.out.println("Esquí eliminado correctamente");
            }
        }
    }

    public static void nuevoSnowboard() throws SQLException {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        System.out.println("-- Introduce los datos del nuevo Snowboard --");

        System.out.print("Introduce el id: ");
        int id = scInt.nextInt();
        System.out.print("Introduce la marca: ");
        String marca = scString.nextLine();
        System.out.print("Introduce el modelo: ");
        String modelo = scString.nextLine();
        System.out.print("Introduce el valor de compra: ");
        double valorCompra = scDouble.nextDouble();
        System.out.print("Introduce el año de compra: ");
        int anioCompra = scInt.nextInt();
        System.out.print("Introduce el número de usos: ");
        int numUsos = scInt.nextInt();
        System.out.print("Introduce el estado: ");
        String estado = scString.nextLine();
        System.out.print("Introduce el tipo: ");
        String tipo = scInt.nextLine();
        System.out.print("Incluye botas? (true/false) ");
        boolean botas = scInt.nextBoolean();

        SnowboardDAOImpl snowboardDAO = new SnowboardDAOImpl();

        snowboardDAO.addSnowboard(new Snowboard(id, marca, modelo, valorCompra, anioCompra, numUsos, estado, tipo, botas));

        scString.close();
        scDouble.close();
        scInt.close();
    }

    public static void delSnowboard() throws SQLException {
        SnowboardDAOImpl snowboardDAO = new SnowboardDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué Snowboard quieres eliminar (Introduce el ID)? ");
        int id = sc.nextInt();

        ArrayList<Snowboard> snowboards = snowboardDAO.getAllSnowboards();
        for (Snowboard s : snowboards) {
            if (s.getId() == id) {
                snowboardDAO.deleteSnowboard(s);
                System.out.println("Snowboard eliminado correctamente");
            }
        }
    }
}