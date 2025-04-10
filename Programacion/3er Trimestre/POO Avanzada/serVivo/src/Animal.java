public class Animal extends SerVivo{

    private String alimentacion;
    private double peso;
    private double altura;

    public Animal(String nombreCientifico, String nombreComun, String especie, String alimentacion, double peso, double altura) {
        super(nombreCientifico, nombreComun, especie);
        this.alimentacion = alimentacion;
        this.peso = peso;
        this.altura = altura;
    }

    public void alimentarse() {
        System.out.println("El animal "+ getNombreComun() + " está comiendo");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "alimentacion='" + alimentacion + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
