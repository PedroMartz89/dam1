public abstract class Hipoteca extends Cuenta{

    public Hipoteca(Cliente cliente, double tipoInteres, double saldo) {
        super(cliente, tipoInteres, saldo);
    }

    @Override
    public double calcularInteres(int meses, double tipoInteres) {

        return meses * tipoInteres;
    }
}
