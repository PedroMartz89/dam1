import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Triangulo triangulo = new Triangulo(10,5);
//        Rectangulo rect = new Rectangulo(10,15);
//        Circulo circ = new Circulo(6,10,15);
//
//        System.out.println("Área del triángulo: " + triangulo.calcularArea());
//        System.out.println("Área del rectángulo: " + rect.calcularArea());
//        System.out.println("Área del círculo: " + circ.calcularArea());
//
        arrayTriangulos();
    }

    public static void arrayTriangulos() {

        ArrayList<Triangulo> arrayTriangulo = new ArrayList<>();
        double total = 0;
        arrayTriangulo.add(new Triangulo(5,3));
        arrayTriangulo.add(new Triangulo(10,8));
        arrayTriangulo.add(new Triangulo(8,6));
        arrayTriangulo.add(new Triangulo(20,15));
        arrayTriangulo.add(new Triangulo(4,2));

        for (Triangulo triangulo : arrayTriangulo) {

            total += triangulo.calcularArea();
        }

        double totalMedia = total / arrayTriangulo.size();

        System.out.println("La media es: " + totalMedia);
    }
}