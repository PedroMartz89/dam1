public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio, double alto, double ancho ) {
        super(alto, ancho);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio;
    }
}
