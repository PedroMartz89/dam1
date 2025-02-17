public class Main {
    public static void main(String[] args) {

        Punto punto1 = new Punto(4,6);
        Punto punto2 = new Punto(-2,8);
        Punto punto3 = new Punto(-5,-1);
        Punto punto4 = new Punto(7,-3);

        System.out.println("Punto 1: ");
        System.out.println("----------------");
        System.out.println("Coordenadas y cuadrante: ");
        System.out.println(punto1.cuadrante(punto1));
        System.out.println("----------------");
        System.out.println("Distancia a (0,0)");
        System.out.println(punto1.distancia(punto1));
        System.out.println();

        System.out.println("Punto 2: ");
        System.out.println("----------------");
        System.out.println("Coordenadas y cuadrante: ");
        System.out.println(punto2.cuadrante(punto2));
        System.out.println("----------------");
        System.out.println("Distancia a (0,0)");
        System.out.println(punto2.distancia(punto2));
        System.out.println();

        System.out.println("Punto 3: ");
        System.out.println("----------------");
        System.out.println("Coordenadas y cuadrante: ");
        System.out.println(punto3.cuadrante(punto3));
        System.out.println("----------------");
        System.out.println("Distancia a (0,0)");
        System.out.println(punto3.distancia(punto3));
        System.out.println();

        System.out.println("Punto 4: ");
        System.out.println("----------------");
        System.out.println("Coordenadas y cuadrante: ");
        System.out.println(punto4.cuadrante(punto4));
        System.out.println("----------------");
        System.out.println("Distancia a (0,0)");
        System.out.println(punto4.distancia(punto4));
        System.out.println("Vamos a mover el punto 4 al primer cuadrante");
        System.out.println(Punto.moverC1(punto4));;


    }
}