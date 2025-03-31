public abstract class FiguraGeometrica {

    private double alto;
    private double ancho;

    public FiguraGeometrica(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public abstract double calcularArea();

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
