public abstract class Cuenta {

    protected Cliente cliente;
    protected double tipoInteres;
    protected double saldo;

    public Cuenta(Cliente cliente, double tipoInteres, double saldo) {
        this.cliente = cliente;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        setSaldo((getSaldo()+cantidad));
    }
    public abstract double calcularInteres(int meses, double tipoInteres);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
