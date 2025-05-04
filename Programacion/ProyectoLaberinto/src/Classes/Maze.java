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
    private ArrayList<Coordinate> path;


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
                case 1 -> firstWay(iface);
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

    public ArrayList<Coordinate> getPath() {
        return path;
    }

    private void firstWay(Interface iface) {
        if (this.map == null) {
            System.out.println("Debes cargar un laberinto primero.");
            iface.toContinue();
            return;
        }
    
        if (this.startI == 0 && this.startJ == 0 && this.endI == 0 && this.endJ == 0) {
            System.out.println("Debes establecer las coordenadas de entrada y salida primero.");
            iface.toContinue();
            return;
        }
    
        boolean[][] visited = new boolean[map.length][map[0].length];
        path = new ArrayList<>();
        ArrayList<Coordinate> stack = new ArrayList<>();
    
        // Agregar la posición inicial a la pila
        stack.add(new Coordinate(startI, startJ, 0));
        visited[startI][startJ] = true;
    
        // Direcciones: arriba, derecha, abajo, izquierda
        int[] dirI = {-1, 0, 1, 0};
        int[] dirJ = {0, 1, 0, -1};
    
        while (!stack.isEmpty()) {
            Coordinate current = stack.remove(stack.size() - 1);
            path.add(current);
    
            // Si llegamos a la salida, terminamos
            if (current.coorI == endI && current.coorJ == endJ) {
                System.out.println("Se encontró un camino desde la entrada hasta la salida.");
                showSolvedMaze(iface);
                return;
            }
    
            // Explorar las celdas adyacentes
            for (int d = 0; d < 4; d++) {
                int newI = current.getCoorI() + dirI[d];
                int newJ = current.getCoorJ() + dirJ[d];
    
                if (validWay(newI, newJ, visited)) {
                    stack.add(new Coordinate(newI, newJ, 0));
                    visited[newI][newJ] = true;
                }
            }
    
            // Si no hay más caminos desde la celda actual, retrocedemos
            if (stack.isEmpty() || stack.get(stack.size() - 1).getCoorI() != current.getCoorI() || stack.get(stack.size() - 1).getCoorJ() != current.getCoorJ()) {
                path.remove(path.size() - 1);
            }
        }
    
        System.out.println("No se encontró un camino desde la entrada hasta la salida.");
    }

    private void showSolvedMaze(Interface iface) {
        if (this.map == null || path == null || path.isEmpty()) {
            System.out.println("No hay un laberinto resuelto para mostrar.");
            iface.toContinue();
            return;
        }
    
        char[][] solvedMap = new char[map.length][map[0].length];
    
        // Copiar el laberinto original al mapa resuelto
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                solvedMap[i][j] = map[i][j];
            }
        }
    
        // Dibujar el camino con flechas
        for (int k = 0; k < path.size() - 1; k++) {
            Coordinate current = path.get(k);
            Coordinate next = path.get(k + 1);
    
            int deltaI = next.getCoorI() - current.getCoorI();
            int deltaJ = next.getCoorJ() - current.getCoorJ();
    
            if (deltaI == -1 && deltaJ == 0) {
                solvedMap[current.getCoorI()][current.getCoorJ()] = '^'; // Arriba
            } else if (deltaI == 1 && deltaJ == 0) {
                solvedMap[current.getCoorI()][current.getCoorJ()] = 'v'; // Abajo
            } else if (deltaI == 0 && deltaJ == 1) {
                solvedMap[current.getCoorI()][current.getCoorJ()] = '>'; // Derecha
            } else if (deltaI == 0 && deltaJ == -1) {
                solvedMap[current.getCoorI()][current.getCoorJ()] = '<'; // Izquierda
            }
        }
    
        // Marcar la entrada y la salida
        solvedMap[startI][startJ] = 'E'; // Entrada
        solvedMap[endI][endJ] = 'S';     // Salida
    
        // Mostrar el laberinto resuelto
        System.out.println("Laberinto resuelto:");
        for (int i = 0; i < solvedMap.length; i++) {
            for (int j = 0; j < solvedMap[i].length; j++) {
                System.out.print(solvedMap[i][j] + " ");
            }
            System.out.println();
        }
    
        iface.toContinue();
    }

    public boolean isLoaded() {
        return loaded;
    }

    public boolean validWay(int i, int j, boolean[][] visited) {

        return i>= 0 && j >= 0 && i < map.length && j < map[0].length &&
                (map[i][j] == ' ' || (i == endI && j == endJ)) && !visited[i][j];
    }
}
