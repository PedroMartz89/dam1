package model;

import java.time.Year;

public class Snowboard extends Equipamiento {

    private String tipo;
    private boolean botas;

    public Snowboard(int id, String marca, String modelo, double valorCompra, int anioCompra, int numUsos, String estado, String tipo, boolean botas) {
        super(id, marca, modelo, valorCompra, anioCompra, numUsos, estado);
        this.tipo = tipo;
        this.botas = botas;
    }

    @Override
    public int antiguedad() {
        int currentYear = Year.now().getValue();
        return currentYear - getAnioCompra();
    }

    @Override
    public double valorActual() {

        int valorPerdido;

        if (isBotas()) {
            valorPerdido = 15 * antiguedad();
        } else {
            valorPerdido = 10 * antiguedad();
        }

        if (getValorCompra() - ((double) (valorPerdido * 8) / 100) < getValorCompra() - ((double) 25 * (getValorCompra() / 100))) {

            return getValorCompra() - ((double) 25 * getValorCompra() / 100);

        } else {

            return getValorCompra() - (valorPerdido * getValorCompra() / 100);

        }

    }

    public String getTipo() {
        return tipo;
    }

    public boolean isBotas() {
        return botas;
    }

    @Override
    public String toString() {
        return "--- Snowboard ---" +
                "\nId:" + id +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nValorCompra: " + valorCompra +
                "\nAnioCompra: " + anioCompra +
                "\nNumUsos: " + numUsos +
                "\nEstado: " + estado +
                "\nTipo: " + tipo +
                "\nBotas: " + botas;
    }
}
