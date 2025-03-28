public class Estudiante extends Persona implements Comparable<Estudiante>{

    private double evaluacion;

    public Estudiante(String nombre, String apellidos, double evaluacion) {
        super(nombre,apellidos); //Con super() llamamos al constructor de la clase padre
        this.evaluacion = evaluacion;
    }

    //GETTER Y SETTER
    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + ", Evaluación: " + evaluacion;
    }

    @Override
    public int compareTo(Estudiante estudiante) {
        return Double.compare(this.evaluacion, estudiante.getEvaluacion());

    }
}
