public class Main {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setMarca("Renault");
        auto.setModelo("Meganne");
        auto.setColor("Beige");
        auto.setCilindrada(1300);


        System.out.println(auto.detalle());
        System.out.println();
        System.out.println(auto.velocidad(120) + " y tiene una velocidad de frenado de " + auto.frenado(8));
    }
}