public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(double alto, double ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        return getAlto() * getAncho();
    }
}
