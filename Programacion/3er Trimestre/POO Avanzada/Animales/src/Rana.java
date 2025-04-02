public class Rana extends Animal{
    int ancas = 4;

    public Rana(String nombre, int edad, String sexo, int ancas) {
        super(nombre, edad, sexo);
        this.ancas = ancas;
    }

    @Override
    public void emitirSonido() {
        System.out.println("CROACK");
    }

}
