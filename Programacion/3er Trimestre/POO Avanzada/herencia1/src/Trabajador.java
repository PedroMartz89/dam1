public class Trabajador extends Persona implements Comparable<Trabajador>{

    private double salario;
    private int horasTrabajadas;

    public Trabajador(String nombre, String apellido, double salario, int horasTrabajadas) {
        super(nombre,apellido);
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    //GETTER Y SETTER
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double sueldoHora() {

        if (horasTrabajadas != 0) {

            return salario / horasTrabajadas;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {

        String aux = super.toString();
        return aux + ", Sueldo por hora: " + sueldoHora() + ", Salario: " + salario;
    }

    @Override
    public int compareTo(Trabajador o) {
        return Double.compare(this.salario, o.salario);
    }
}
