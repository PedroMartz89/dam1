public class Credito extends Cuenta {


    public Credito(Cliente cliente, double tipoInteres, double saldo) {
        super(cliente, tipoInteres, saldo);
    }

    @Override
    public void depositar(double cantidad) {
        setSaldo((getSaldo()+cantidad));
    }

    @Override
    public double calcularInteres(int meses, double tipoInteres) {

        if (meses < 3 && getCliente().getTipoCliente().equals("particular")) {

            return 0;

        } else {

            return meses * tipoInteres;
        }
    }
}
