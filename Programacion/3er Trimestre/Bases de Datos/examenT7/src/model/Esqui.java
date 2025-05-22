package model;

import java.time.Year;

public class Esqui extends Equipamiento {

    private int talla;
    private boolean fijaciones;

    public Esqui(int id, String marca, String modelo, double valorCompra, int anioCompra, int numUsos, String estado, int talla, boolean fijaciones) {
        super(id, marca, modelo, valorCompra, anioCompra, numUsos, estado);
        this.talla = talla;
        this.fijaciones = fijaciones;
    }

    @Override
    public int antiguedad() {
        int currentYear = Year.now().getValue();
        return currentYear - getAnioCompra();
    }

    @Override
    public double valorActual() {

        int valorPerdido;

        if (isFijaciones()) {
            valorPerdido = 13 * antiguedad();
        } else {
            valorPerdido = 8 * antiguedad();
        }

        if (getValorCompra() - ((double) (valorPerdido * 8) / 100) < getValorCompra() - ((double) 20 * (getValorCompra() / 100))) {

            return getValorCompra() - ((double) 20 * getValorCompra() / 100);

        } else {

            return getValorCompra() - (valorPerdido * getValorCompra() / 100);

        }

    }

    public int getTalla() {
        return talla;
    }

    public boolean isFijaciones() {
        return fijaciones;
    }

    @Override
    public String toString() {
        return "--- Esquí ---" +
                "\nId:" + id +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nValorCompra: " + valorCompra +
                "\nAnioCompra: " + anioCompra +
                "\nNumUsos: " + numUsos +
                "\nEstado: " + estado +
                "\nTalla: " + talla +
                "\nFijaciones: " + fijaciones;
    }
}
