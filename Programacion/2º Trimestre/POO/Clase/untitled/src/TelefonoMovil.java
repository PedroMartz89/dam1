public class TelefonoMovil {
    private String modelo;
    private String fabricante;
    private double precio;
    private String dueno;
    private int bateria;
    private int pantalla;

    public TelefonoMovil(String modelo, String dueno, String fabricante) {
        this.modelo = modelo;
        this.dueno = dueno;
        this.fabricante = fabricante;
    }

    public TelefonoMovil(double precio, int pantalla, int bateria, String fabricante, String modelo) {
        this.precio = precio;
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public TelefonoMovil() {
    }

    public String nokia95() {

        return this.modelo = "nokia95";
    }

    public String mostrarNokia() {

        return nokia95();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }
}
