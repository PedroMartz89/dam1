public class Gato extends Animal {

    public Gato(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }

    @Override
    public void emitirSonido() {
        System.out.println("MIAUUUUU");
    }

}
