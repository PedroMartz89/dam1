package Classes;

public class Config {

    private String VERSION = "0.1";
    private String FILE_PATH = "./assets/files/users.txt";
    private String USERS_FILE = "users.txt";
    private String WELCOME = "BIENVENIDO AL LABERINTO";
    private String GOODBYE = "Adiós!";
    private String UNLOGGED_MENU = "Seleccione una opción: \n" +
            "1 Iniciar sesión\n" +
            "2 Registro\n" +
            "0 Salir";

    private String LOGGED_MENU = "" +
            "1 Cargar laberinto\n" +
            "2 Ver laberinto actual\n" +
            "3 Establecer casillas de entrada y salida\n" +
            "4 Buscar caminos\n" +
            "5 Ver usuario actual\n" +
            "6 Cerrar sesión\n" +
            "0 Salir";


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
}
