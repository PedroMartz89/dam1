public class Main {
    public static void main(String[] args) {

        Persona per = new Persona();
        per.setNombre("Pedro");
        per.setApellido1("Martínez");
        per.setApellido2("Sánchez");
        per.setDni("52808579G");

        System.out.println(per.nombreCompleto());
    }
}