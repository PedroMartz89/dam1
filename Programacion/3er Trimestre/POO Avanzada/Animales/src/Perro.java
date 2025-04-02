public class Perro extends Animal {
    private int patas = 4;
    public Perro(String nombre, int edad, String sexo, int patas) {
        super(nombre, edad, sexo);
        this.patas = patas;
    }

    @Override
    public void emitirSonido() {
        System.out.println("GUAU GUAU");
    }

}
