public class Pantalla {

    private int tamano;
    private String fabricante;
    private String modelo;

    public Pantalla() {
    }

    public Pantalla(String modelo, int tamano, String fabricante) {
        this.modelo = modelo;
        this.tamano = tamano;
        this.fabricante = fabricante;
    }

    public Pantalla(int tamano) {
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
