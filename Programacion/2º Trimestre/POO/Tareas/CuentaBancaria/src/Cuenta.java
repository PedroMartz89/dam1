
public class Cuenta {

    private long numCuenta;
    private long dni;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(long dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta(long numCuenta, long dni, double saldo) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }


    public void ingresar(double cantidad) {

        this.saldo = this.saldo + cantidad;

        System.out.println("Se han ingresado " + cantidad + "€ correctamente en la cuenta");

    }

    public void retirar(double cantidad) {

        if (this.saldo >= cantidad) {

            this.saldo = this.saldo - cantidad;
            System.out.println("Se han retirado " + cantidad + "€ correctamente de la cuenta");

        } else {

            System.out.println("No se puede retirar la cantidad establecida.");
        }


    }

    @Override
    public String toString() {
        return "Información de la cuenta: " +
                "\nNúmero de la cuenta: " + numCuenta +
                "\nDNI:" + dni +
                "\nSaldo actual: " + saldo
                ;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
