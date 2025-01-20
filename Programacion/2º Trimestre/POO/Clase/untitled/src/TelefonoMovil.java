public class TelefonoMovil {
    private String modelo;
    private String fabricante;
    private double precio;
    private String dueno;
    private Bateria bateria;
    private Pantalla pantalla;

    public TelefonoMovil(String modelo, double precio, String fabricante) {
        this.modelo = modelo;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public TelefonoMovil(double precio, Pantalla pantalla, Bateria bateria, String fabricante, String modelo) {
        this.precio = precio;
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public TelefonoMovil() {
        super();
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

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                ", dueno='" + dueno + '\'' +
                ", bateria=" + bateria +
                ", pantalla=" + pantalla +
                '}';
    }
}
