public class Automovil {

    private String marca;
    private String modelo;
    private String color;
    private Integer cilindrada;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String detalle() {

        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nColor: " + this.color;
    }

    public String velocidad(Integer vel) {

        return "El " + this.marca + " " + this.modelo + " va a " + vel + "km/h";
    }

    public String frenado(Integer fren) {

        return fren + "s";
    }


}
