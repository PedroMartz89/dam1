public class Triangulo extends FiguraGeometrica{

    public Triangulo(double alto, double ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        return getAlto() * getAncho() / 2;
    }
}
