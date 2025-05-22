package model;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String matricula, String marca, String modelo, String ano, int numPuertas) {
        super(matricula, marca, modelo, ano);
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numPuertas=" + numPuertas +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
