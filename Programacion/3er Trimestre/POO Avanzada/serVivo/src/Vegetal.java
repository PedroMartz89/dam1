public class Vegetal extends SerVivo{

    private double altura;

    public Vegetal(String nombreCientifico, String nombreComun, String especie, double altura) {
        super(nombreCientifico, nombreComun, especie);
        this.altura = altura;
    }

    public void alimentarse() {
        System.out.println("La planta " + getNombreComun() + " está haciendo la fotosíntesis");
    }

    @Override
    public String toString() {
        return "Vegetal{" +
                "altura=" + altura +
                '}';
    }
}
