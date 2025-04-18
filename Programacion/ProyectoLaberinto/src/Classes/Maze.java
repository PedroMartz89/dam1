package Classes;
import java.io.*;
import java.util.Scanner;

public class Maze {

    private char[][] map = null;
    private String filename;
    private String mazePath;
    private boolean loaded;
    private int startI;
    private int startJ;
    private int endI;
    private int endJ;



    public void loadMaze() {
        Config config = new Config();
        Interface iface = new Interface();
        this.filename = listDirectory(config, iface);
        this.mazePath = "assets/mazes/" + filename;

        try {
            BufferedReader br = new BufferedReader(new FileReader(mazePath));

            String line;
            int row = 0;
            int column = 0;
            while ((line = br.readLine()) != null) {
                row++;
                column = Math.max(column, line.length());
            }
            br.close();

            BufferedReader br2 = new BufferedReader(new FileReader(mazePath));

            map = new char[row][column];

            for (int i = 0; i < row ; i++) {
                line = br2.readLine();
                if (line != null) {

                    for (int j = 0; j < line.length(); j++) {
                        map[i][j] = line.charAt(j);
                    }
                }
            }
            System.out.printf("Laberinto %s cargado correctamente\n", this.filename);
            br2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void setEntranceExit(Interface iface) {

        if (this.map != null) {
            this.startI = iface.getInt("Introduce la cordenada de entrada I: ");
            this.startJ = iface.getInt("Introduce la cordenada de entrada J: ");
            this.endI = iface.getInt("Introduce la cordenada de salida I: ");
            this.endJ = iface.getInt("Introduce la cordenada de salida J: ");

        } else {
            System.out.println("Debes cargar un laberinto primero");
            iface.toContinue();
        }



    }

    public void showMaze(Interface iface) {
        if (this.map != null) {
            for (char[] line : map) {
                System.out.println(new String(line));
            }
        } else {

            System.out.println("Debes cargar un laberinto primero");
            iface.toContinue();
        }

    }

    public String listDirectory(Config config, Interface iface) {

        File directory = new File(config.getMAZES_PATH());
        int option = 0;
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();

            if (files != null) {
                System.out.println("Elije una de las opciones:");
                for (String file : files) {
                    System.out.println(file);
                }
                option = iface.getInt();
                return files[option - 1];
            } else {
                System.out.println("El directorio está vacío.");

            }
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
        return "No se ha podido realizar la operación";
    }
}
