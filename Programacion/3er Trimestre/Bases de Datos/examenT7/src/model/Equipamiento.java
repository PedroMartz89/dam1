package model;

public abstract class Equipamiento {

    protected int id;
    protected String marca;
    protected String modelo;
    protected double valorCompra;
    protected int anioCompra;
    protected int numUsos;
    protected String estado;

    public Equipamiento(int id, String marca, String modelo, double valorCompra, int anioCompra, int numUsos, String estado) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.valorCompra = valorCompra;
        this.anioCompra = anioCompra;
        this.numUsos = numUsos;
        this.estado = estado;
    }

    public abstract int antiguedad();
    public abstract double valorActual();

    @Override
    public String toString() {
        return "Equipamiento{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valorCompra=" + valorCompra +
                ", anioCompra=" + anioCompra +
                ", numUsos=" + numUsos +
                ", estado='" + estado + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public int getAnioCompra() {
        return anioCompra;
    }

    public int getNumUsos() {
        return numUsos;
    }

    public String getEstado() {
        return estado;
    }
}
