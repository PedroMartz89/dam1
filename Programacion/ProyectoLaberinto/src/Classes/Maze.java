package Classes;

import java.io.*;
import java.util.ArrayList;

public class Maze {

    private char[][] map = null;
    private String filename;
    private String mazePath;
    private boolean loaded;
    private int startI;
    private int startJ;
    private int endI;
    private int endJ;
    private ArrayList<Coordinate> coordinates;


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
            this.loaded = true;
            br2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void setEntranceExit(Interface iface) {

        if (this.map != null) {

          while (true) {
                System.out.print("Introduce la cordenada de entrada I: ");
                int auxI = iface.getInt();
                System.out.print("Introduce la cordenada de entrada J: ");
                int auxJ = iface.getInt();

                if (validCoordinate(auxI, auxJ)) {
                    this.startI = auxI;
                    this.startJ = auxJ;
                    break;
                } else {

                    System.out.println("Las coordenadas proporcionadas no son válidas");
                }
          }
          while (true) {
              System.out.print("Introduce la cordenada de salida I: ");
              int auxI = iface.getInt();
              System.out.print("Introduce la cordenada de salida J: ");
              int auxJ = iface.getInt();
              if (validCoordinate(auxI, auxJ)) {
                  this.endI = auxI;
                  this.endJ = auxJ;
                  break;
              } else {
                  System.out.println("Las coordenadas proporcionadas no son válidas");
              }
          }

            System.out.println("Coordenadas establecidas correctamente\n");

        } else {
            System.out.println("Debes cargar un laberinto primero");
            iface.toContinue();
        }

    }

    public void showMaze(Interface iface) {
        if (this.map != null) {

            System.out.print("   ");
            for (int j = 0; j < map[0].length; j++) {
                System.out.printf("%2d ", j);
            }
            System.out.println();

            for (int i = 0 ; i < map.length; i++) {
                System.out.printf("%2d ", i); // número de fila al inicio

                for (int j = 0; j < map[i].length; j++) {
                    if (i == this.startI && j == this.startJ && this.startI != 0 && this.startJ != 0) {
                        System.out.print("E  ");
                    } else if (i == this.endI && j == this.endJ && this.startI != 0 && this.startJ != 0) {
                        System.out.print("S  ");
                    } else if (map[i][j] == '#') {
                        System.out.print("#  ");
                    } else if (map[i][j] == ' ') {
                        System.out.print("   ");
                    }
                }
                System.out.println();
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
                int i = 1;
                for (String file : files) {
                    System.out.println(i + ". " + file);
                    i++;
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

    private boolean validCoordinate(int i, int j) {
        return i >= 0 && i < map.length &&
                j >= 0 && j < map[i].length &&
                map[i][j] == ' ';
    }

    public void mazeWays(Config config, Interface iface) {

        System.out.println(config.getMAZE_MENU());
        int option = iface.getInt("Seleccione una opción: ");
        boolean bool = true;

        while (bool) {
            switch (option) {
                case 1 -> showSolvedMaze(firstWay(iface), iface);
                case 2 -> fastestWay();
                case 0 -> {
                    bool = false;
                    iface.toContinue();
                }
                default -> {
                    System.out.println("Opción no válida, vuelva a intentarlo.");
                    iface.toContinue();
                }
            }
            if (bool) {
                System.out.println(config.getMAZE_MENU());
                option = iface.getInt("Seleccione una opción: ");
            }
        }

    }

    private void fastestWay() {

    }

    private ArrayList<int[]> firstWay(Interface iface) {

        ArrayList<int[]> way = new ArrayList<>();

        int i = this.startI;
        int j = this.startJ;
        boolean[][] visited = new boolean[map.length][map[0].length];
        visited[i][j] = true; // Marcar inicio como visitado

        way.add(new int[]{i, j, 0}); // Dirección 0 = inicial

        int totalSteps = 0;

        while (!(i == this.endI && j == this.endJ)) {

            if (validWay(i, j + 1, visited)) { // Derecha
                j++;
                visited[i][j] = true;
                way.add(new int[]{i, j, 2});
                totalSteps++;
            } else if (validWay(i + 1, j, visited)) { // Abajo
                i++;
                visited[i][j] = true;
                way.add(new int[]{i, j, 3});
                totalSteps++;
            } else if (validWay(i, j - 1, visited)) { // Izquierda
                j--;
                visited[i][j] = true;
                way.add(new int[]{i, j, 4});
                totalSteps++;
            } else if (validWay(i - 1, j, visited)) { // Arriba
                i--;
                visited[i][j] = true;
                way.add(new int[]{i, j, 1});
                totalSteps++;
            } else {
            if (way.size() <= 1) {
                System.out.println("No hay camino posible.");
                return new ArrayList<>();  // Retornar vacío si no se puede avanzar
            }
            way.remove(way.size() - 1); // Eliminar último paso
            int[] last = way.get(way.size() - 1);
            i = last[0];
            j = last[1];
            totalSteps--;
        }



    }

        // Mostrar pasos realizados
        System.out.println("---- Movimientos realizados ----");
        for (int k = 1; k < way.size(); k++) {
            int[] paso = way.get(k);
            String direccion = switch (paso[2]) {
                case 1 -> "Arriba";
                case 2 -> "Derecha";
                case 3 -> "Abajo";
                case 4 -> "Izquierda";
                default -> "Inicio";
            };
            System.out.println("Paso " + k + ": (" + paso[0] + ", " + paso[1] + ") - " + direccion);
        }
        System.out.println("Total de pasos: " + totalSteps);


        
        // Mostrar el laberinto con el camino resuelto
        return way;
    }

    public void showSolvedMaze(ArrayList<int[]> way, Interface iface) {
        if (this.map != null) {
            // Imprimir encabezado de columnas
            System.out.print("   ");
            for (int j = 0; j < map[0].length; j++) {
                System.out.printf("%2d ", j);
            }
            System.out.println();

            for (int i = 0; i < map.length; i++) {
                // Imprimir número de fila
                System.out.printf("%2d ", i);
                for (int j = 0; j < map[i].length; j++) {

                    // Verificamos si esta posición está en el camino
                    boolean isWay = false;
                    char chara = ' ';
                    for (int k = 1; k < way.size(); k++) {
                        int[] prev = way.get(k - 1);
                        int[] curr = way.get(k);

                        if (prev[0] == i && prev[1] == j) {
                            isWay = true;
                            if (curr[0] == i - 1 && curr[1] == j) chara = '^';      // arriba
                            else if (curr[0] == i + 1 && curr[1] == j) chara = 'v'; // abajo
                            else if (curr[0] == i && curr[1] == j - 1) chara = '<'; // izquierda
                            else if (curr[0] == i && curr[1] == j + 1) chara = '>'; // derecha
                            break;
                        }
                    }

                    // Imprimir la celda
                    if (i == this.startI && j == this.startJ) {
                        System.out.print("E  ");
                    } else if (i == this.endI && j == this.endJ) {
                        System.out.print("S  ");
                    } else if (map[i][j] == '#') {
                        System.out.print("#  ");
                    } else if (isWay) {
                        System.out.print(chara + "  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("Debes cargar un laberinto primero");
            iface.toContinue();
        }

    }

    public boolean isLoaded() {
        return loaded;
    }

    public boolean validWay(int i, int j, boolean[][] visited) {

        return i>= 0 && j >= 0 && i < map.length && j < map[0].length &&
                (map[i][j] == ' ' || (i == endI && j == endJ)) && !visited[i][j];
    }
}
