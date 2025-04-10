public class Deposito extends Cuenta {


    public Deposito(Cliente cliente, double tipoInteres, double saldo) {
        super(cliente, tipoInteres, saldo);
    }

    @Override
    public void depositar(double cantidad) {
        setSaldo((getSaldo()+cantidad));
    }

    @Override
    public double calcularInteres(int meses, double tipoInteres) {

        if (getSaldo() < 1000) {

            return getSaldo();

        } else {

            return meses * tipoInteres;
        }
    }
}
