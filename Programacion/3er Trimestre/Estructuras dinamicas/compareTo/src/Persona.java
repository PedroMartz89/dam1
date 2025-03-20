public class Persona implements Comparable<Persona> {

    private String nombre;
    private int altura;
    private int edad;

    public Persona(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.altura, o.altura);
    }

    @Override
    public String toString() {
        return "--Persona--\n " +
                "nombre: " + nombre +
                " - altura: " + altura +
                " - edad: " + edad;
    }
}
