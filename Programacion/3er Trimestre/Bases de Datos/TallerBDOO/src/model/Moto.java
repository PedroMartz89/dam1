package model;

public class Moto extends Vehiculo {

    private String tipoManillar;


    public Moto(String matricula, String marca, String modelo, String ano, String tipoManillar) {
        super(matricula, marca, modelo, ano);
        this.tipoManillar = tipoManillar;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipoManillar='" + tipoManillar + '\'' +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }

    public String getTipoManillar() {
        return tipoManillar;
    }
}
