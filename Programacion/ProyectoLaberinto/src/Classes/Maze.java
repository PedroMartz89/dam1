package Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
                case 2 -> fastestWay(iface);
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

    private void fastestWay(Interface iface) {

    //Nos aseguramos de que hay laberinto cargado
        if (this.map == null) {
        System.out.println("Debes cargar un laberinto primero.");
        iface.toContinue();
        return;
    }
    //Y que las casillas de entrada y salida estén indicadas
    if (this.startI == 0 && this.startJ == 0 && this.endI == 0 && this.endJ == 0) {
        System.out.println("Debes establecer las coordenadas de entrada y salida primero.");
        iface.toContinue();
        return;
    }

    //Cramos un array de dos dimensiones para guardar las casillas visitadas
    boolean[][] visited = new boolean[map.length][map[0].length];

    //Matriz con la casilla anterior a la casilla visitada
    Coordinate[][] parent = new Coordinate[map.length][map[0].length];


    Queue<Coordinate> queue = new LinkedList<>();
    visited[startI][startJ] = true;
    queue.add(new Coordinate(startI, startJ, 0));

    // Direcciones: arriba, derecha, abajo, izquierda
    int[] dirI = {-1, 0, 1, 0};
    int[] dirJ = {0, 1, 0, -1};
    int[] dirCodes = {1, 2, 3, 4};

    boolean found = false;

    while (!queue.isEmpty()) {
        Coordinate current = queue.poll();
        
        //Si estamos en la casilla de salida, completamos el laberinto
        if (current.getCoorI() == endI && current.getCoorJ() == endJ) {
            found = true;
            break;
        }
        
        
        //Explora las celdas de alrededor para encontrar a donde moverse
        for (int d = 0; d < 4; d++) {
            int newI = current.getCoorI() + dirI[d];
            int newJ = current.getCoorJ() + dirJ[d];

            //Si encuentra una casilla válida, la almacena en la cola
            if (validWay(newI, newJ, visited)) {
                visited[newI][newJ] = true;
                queue.add(new Coordinate(newI, newJ, dirCodes[d]));
                parent[newI][newJ] = new Coordinate(current.getCoorI(), current.getCoorJ(), dirCodes[d]);
            }
        }
    }

    if (!found) {
        System.out.println("No se encontró un camino desde la entrada hasta la salida.");
        return;
    }

    // Reconstruir el camino más corto desde el final hacia el inicio
    path = new ArrayList<>();
    int i = endI, j = endJ;

    //Recorremos el camino hacia atrás
    while (!(i == startI && j == startJ)) {
        Coordinate p = parent[i][j];
        int dir = 0;
        if (p != null) {
            dir = getDirection(p.getCoorI(), p.getCoorJ(), i, j);
        }
        path.add(0, new Coordinate(i, j, dir));  // Agregar al principio
        i = p.getCoorI();
        j = p.getCoorJ();
    }

    path.add(0, new Coordinate(startI, startJ, 0));  // Agrega el punto inicial

    System.out.println("Se encontró el camino más corto.");
    
    showSolvedMaze(iface);
}

    private int getDirection(int fromI, int fromJ, int toI, int toJ) {
        if (toI == fromI - 1) return 1; // Arriba
        if (toJ == fromJ + 1) return 2; // Derecha
        if (toI == fromI + 1) return 3; // Abajo
        if (toJ == fromJ - 1) return 4; // Izquierda
        return 0;
    }


    public ArrayList<Coordinate> getPath() {
        return path;
    }

    private void firstWay(Interface iface) {
    
        //Verificaciones
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
        Stack<Coordinate> stack = new Stack<>();

        // Direcciones: arriba, derecha, abajo, izquierda
        int[] dirI = {-1, 0, 1, 0};
        int[] dirJ = {0, 1, 0, -1};
        int[] dirCodes = {1, 2, 3, 4};

        stack.push(new Coordinate(startI, startJ, 0));
        visited[startI][startJ] = true;

        while (!stack.isEmpty()) {
            Coordinate current = stack.peek();

            // Si ya llegamos a la meta
            if (current.getCoorI() == endI && current.getCoorJ() == endJ) {
                path = new ArrayList<>(stack);  // Guardamos la ruta encontrada
                System.out.println("Se encontró un camino desde la entrada hasta la salida.");
                showSolvedMaze(iface);
                return;
            }

            boolean moved = false;

            for (int d = 0; d < 4; d++) {
                int newI = current.getCoorI() + dirI[d];
                int newJ = current.getCoorJ() + dirJ[d];

                if (validWay(newI, newJ, visited)) {
                    visited[newI][newJ] = true;
                    stack.push(new Coordinate(newI, newJ, dirCodes[d]));
                    moved = true;
                    break;
                }
            }

            // Si no se pudo mover, retrocedemos (backtrack)
            if (!moved) {
                stack.pop();
            }
        }

        System.out.println("No se encontró un camino desde la entrada hasta la salida.");
    }


    public void showSolvedMaze(Interface iface) {
        if (this.map != null && path != null && !path.isEmpty()) {
            System.out.print("   ");
            for (int j = 0; j < map[0].length; j++) {
                System.out.printf("%2d ", j);
            }
            System.out.println();
    
            for (int i = 0; i < map.length; i++) {
                System.out.printf("%2d ", i);
                for (int j = 0; j < map[i].length; j++) {
    
                    boolean isInWay = false;
                    char simbol = ' ';
    
                    for (Coordinate paso : path) {
                        if (paso.getCoorI() == i && paso.getCoorJ() == j) {
                            isInWay = true;
                            simbol = switch (paso.getDir()) {
                                case 1 -> '^';
                                case 2 -> '>';
                                case 3 -> 'v';
                                case 4 -> '<';
                                default -> '.';
                            };
                            break;
                        }
                    }
    
                    if (i == this.startI && j == this.startJ) {
                        System.out.print("E  ");
                    } else if (i == this.endI && j == this.endJ) {
                        System.out.print("S  ");
                    } else if (map[i][j] == '#') {
                        System.out.print("#  ");
                    } else if (isInWay) {
                        System.out.print(simbol + "  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
                
            }
    
        } else {
            System.out.println("Debes cargar y resolver un laberinto primero.");
            iface.toContinue();
        }

        showPath();
    }

    public boolean isLoaded() {
        return loaded;
    }

    public boolean validWay(int i, int j, boolean[][] visited) {

        return i>= 0 && j >= 0 && i < map.length && j < map[0].length &&
                (map[i][j] == ' ' || (i == endI && j == endJ)) && !visited[i][j];
    }

    public void showPath(){
        System.out.println("\nCantidad de pasos: " + (path.size() - 1));

    System.out.println("Coordenadas del camino con dirección:");
    for (Coordinate step : path) {
        String dirTexto = switch (step.getDir()) {
            case 1 -> "^ Arriba";
            case 2 -> "> Derecha";
            case 3 -> "v Abajo";
            case 4 -> "< Izquierda";
            default -> "Inicio";
        };
        System.out.printf("(%d, %d) - %s\n", step.getCoorI(), step.getCoorJ(), dirTexto);
    }

    }
}
