package Classes;

/**
 * Clase que contiene la configuración del programa.
 * @version 0.1.0
 * @author Pedro
 */

public class Config {
    /**  
     *Versión del programa.
     */
    private String VERSION = "1.0.0";
    /**
     * Ruta del archivo de usuarios.
     */
    private String FILE_PATH = "./assets/files/users.txt";
    /**
     * Nombre del fichero de usuarios.
     */
    private String USERS_FILE = "users.txt";
    /**
     * Mensaje de bienvenida.
     */
    private String WELCOME = "BIENVENIDO AL LABERINTO";
    /**
     * Mensaje de despedida.
     */
    private String GOODBYE = "Adiós!";
    /**
     * Menú para usuarios no logueados.
     */
    private String UNLOGGED_MENU = """
            Seleccione una opción:\s
            1 Iniciar sesión
            2 Registro
            0 Salir""";
    /**
     * Menú para usuarios logueados.
     */
    private String LOGGED_MENU = "" +
            "1 Cargar laberinto\n" +
            "2 Ver laberinto actual\n" +
            "3 Establecer casillas de entrada y salida\n" +
            "4 Buscar caminos\n" +
            "5 Ver usuario actual\n" +
            "6 Cerrar sesión\n" +
            "0 Salir";

    private String MAZE_MENU = "" +
            "Selecciona un camino\n" +
            "---------------------\n" +
            "1 El primer camino posible\n" +
            "2 El camino más corto posible\n" +
            "0 Salir";

    private String MAZES_PATH = "./assets/mazes";

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public void setFILE_PATH(String FILE_PATH) {
        this.FILE_PATH = FILE_PATH;
    }

    public String getWELCOME() {
        return WELCOME;
    }

    public void setWELCOME(String WELCOME) {
        this.WELCOME = WELCOME;
    }

    public String getUSERS_FILE() {
        return USERS_FILE;
    }

    public void setUSERS_FILE(String USERS_FILE) {
        this.USERS_FILE = USERS_FILE;
    }

    public String getGOODBYE() {
        return GOODBYE;
    }

    public void setGOODBYE(String GOODBYE) {
        this.GOODBYE = GOODBYE;
    }

    public String getUNLOGGED_MENU() {
        return UNLOGGED_MENU;
    }

    public void setUNLOGGED_MENU(String UNLOGGED_MENU) {
        this.UNLOGGED_MENU = UNLOGGED_MENU;
    }

    public String getLOGGED_MENU() {
        return LOGGED_MENU;
    }

    public void setLOGGED_MENU(String LOGGED_MENU) {
        this.LOGGED_MENU = LOGGED_MENU;
    }

    public String getMAZES_PATH() {
        return MAZES_PATH;
    }

    public void setMAZES_PATH(String MAZES_PATH) {
        this.MAZES_PATH = MAZES_PATH;
    }

    public String getMAZE_MENU() {
        return MAZE_MENU;
    }
}
