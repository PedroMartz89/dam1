public class Movil {

    private String modelo;
    private String cpu;
    private String ram;
    private String disco;
    private String bateria;
    private String pantalla;
    private String sistema;


    public Movil() {
    }

    public Movil(String modelo, String cpu, String ram, String disco, String bateria, String pantalla, String sistema) {
        this.modelo = modelo;
        this.cpu = cpu;
        this.ram = ram;
        this.disco = disco;
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "movil{" +
                "modelo='" + modelo + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", disco='" + disco + '\'' +
                ", bateria='" + bateria + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", sistema='" + sistema + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
