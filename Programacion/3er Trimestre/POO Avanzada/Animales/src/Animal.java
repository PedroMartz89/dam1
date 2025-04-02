public abstract class Animal {

    private String nombre;
    private int edad;
    private String sexo;

    public Animal(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public abstract void emitirSonido();

    @Override
    public String toString() {
        return "-- Animal --" +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nSexo: " + sexo;
    }
}
