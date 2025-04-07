public class Deposito extends Cuenta {


    protected Deposito(Cliente cliente) {
        super(cliente);
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
