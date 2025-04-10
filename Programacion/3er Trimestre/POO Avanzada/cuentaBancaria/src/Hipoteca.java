public abstract class Hipoteca extends Cuenta{

    public Hipoteca(Cliente cliente, double tipoInteres, double saldo) {
        super(cliente, tipoInteres, saldo);
    }

    @Override
    public void depositar(double cantidad) {
        setSaldo((getSaldo()+cantidad));
    }

    @Override
    public double calcularInteres(int meses, double tipoInteres) {

        if (meses < 6 && getCliente().getTipoCliente().equals("empresa")) {

            return meses * (tipoInteres/2);
        } else if (meses <= 6 && getCliente().getTipoCliente().equals("particular")){

            return meses * (tipoInteres/2);
        }
        return meses * tipoInteres;
    }
}
