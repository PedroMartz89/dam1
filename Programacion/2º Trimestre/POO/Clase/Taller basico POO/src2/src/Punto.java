public class Punto {

    private double x;
    private double y;


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String cuadrante(Punto punto) {

        String cuadrante = "";

        if (punto.getX() > 0 && punto.getY() > 0) {
            cuadrante = "El punto con las cordenadas (" + punto.getX() + ", " + punto.getY() + ") está en el cuadrante 1";

        } else if (punto.getX() < 0 && punto.getY() > 0) {

            cuadrante = "El punto con las cordenadas (" + punto.getX() + ", " + punto.getY() + ") está en el cuadrante 2";

        } else if (punto.getX() < 0 && punto.getY() < 0) {

            cuadrante = "El punto con las cordenadas (" + punto.getX() + ", " + punto.getY() + ") está en el cuadrante 3";

        } else if (punto.getX() > 0 && punto.getY() < 0) {

            cuadrante = "El punto con las cordenadas (" + punto.getX() + ", " + punto.getY() + ") está en el cuadrante 4";
        }


        return cuadrante;
    }

    public String distancia(Punto punto) {

        double distancia = Math.sqrt(Math.pow((getX() - 0),2) + Math.pow((getY() - 0),2));


        return "La distancia con las coordenadas (0,0) es: " + distancia;
    }

    public static String moverC1(Punto punto) {

        if (punto.getX() > 0 && punto.getY() > 0) {
            System.out.println("El punto ya está en el primer cuadrante");
        } else {

            punto.setX(Math.abs(punto.getX()));
            punto.setY(Math.abs(punto.getY()));

        }

        return punto.cuadrante(punto);

    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
