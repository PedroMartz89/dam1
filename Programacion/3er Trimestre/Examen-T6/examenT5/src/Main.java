import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = importarClientes();

        mostrarToString(clientes);
        int espacios = espaciosRestantes(clientes);
        System.out.printf("\nSe pueden añadir %d clientes\n",espacios);
        introducirCliente(clientes);
        mostrarToString(clientes);
        System.out.println();
        calcularDescuentos(clientes);
        clientes[3] = null;
        mostrarToString(clientes);
        System.out.println("Fin del programa");
    }

    public static Cliente[] importarClientes() {

        Cliente[] arrayClientes = new Cliente[9];
        int index = 0;
        try {

            File clientes = new File("./assets/clientes.txt");
            Scanner reader = new Scanner(clientes);

            String data = reader.nextLine();
            reader.close();

            String[] clientesArray = data.split(";");

            for (String dato : clientesArray) {

                String[] cliente = dato.split("#");
                String nif = Utilidades.validarNif(cliente[2]);
                String email = Utilidades.validarEmail(cliente[4]);
                String telefono = Utilidades.validarTelefono(cliente[5]);
                String matricula = Utilidades.validarMatricula(cliente[9]);
                String descuento = Utilidades.validarDescuento(cliente[8]);


                    if (index < 9) {
                        arrayClientes[index] = new Cliente(cliente[0], cliente[1], nif,
                                cliente[3], email, telefono,
                                cliente[6], cliente[7], descuento, matricula);
                        index++;
                    }

            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return arrayClientes;
    }

    public static void mostrarClientes(Cliente[] arrayClientes) {

        for (Cliente cliente : arrayClientes) {

            if (cliente != null) {
                System.out.println(cliente.infoReducida());
                System.out.println();

            } else {
                break;
            }
        }
    }

    public static Cliente[] agregarCliente(Cliente[] clientes, Cliente nuevoCliente) {

        for (int i = 0 ; i < clientes.length ; i++) {

            if (clientes[i] == null) {
               clientes[i] = nuevoCliente;
            }
        }
        return clientes;
    }

    public static void mostrarToString(Cliente[] clientes) {
        for (int i = 0; i < clientes.length; i ++) {
            System.out.println();
            System.out.println("Cliente " + (i + 1));
            System.out.println(clientes[i]);
        }
    }

    public static int espaciosRestantes(Cliente[] clientes) {

        int espacios = 0;

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {

                espacios++;
            }
        }
        return espacios;
    }

    public static void introducirCliente(Cliente[] clientes) {

        int contador = 0;
        while (contador < 2) {
            Scanner input = new Scanner(System.in);

            System.out.println("Introduce el nombre: ");
            String nombre = input.nextLine();

            System.out.println("Introduce el apellido: ");
            String apellido = input.nextLine();

            System.out.println("Introduce el nif: ");
            String nif = input.nextLine();

            System.out.println("Introduce el direccion: ");
            String direccion = input.nextLine();

            System.out.println("Introduce el email: ");
            String email = input.nextLine();

            System.out.println("Introduce el telefono: ");
            String telefono = input.nextLine();

            System.out.println("Introduce la fecha de alta: ");
            String fecha = input.nextLine();

            System.out.println("Introduce el tipo (normal / premium): ");
            String tipo = input.nextLine();

            System.out.println("Introduce el descuento: ");
            String descuento = input.nextLine();

            System.out.println("Introduce la matricula: ");
            String matricula = input.nextLine();

            nif = Utilidades.validarNif(nif);
            email = Utilidades.validarEmail(email);
            telefono = Utilidades.validarTelefono(telefono);
            matricula = Utilidades.validarMatricula(matricula);
            descuento = Utilidades.validarDescuento(descuento);

            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] == null) {

                    clientes[i] = new Cliente(nombre, apellido, nif, direccion, email, telefono, fecha, tipo, descuento, matricula);
                    break;
                }
            }
            contador++;
        }

    }

    public static void calcularDescuentos(Cliente[] clientes) {
        double descuentos = 0.0;
        int totalDescuentos = 0;

        for (Cliente cliente : clientes) {

            if (cliente != null) {
                if (cliente.getTipo().equals("normal")) {
                    double descuento = Double.parseDouble(cliente.getDescuento());
                    descuentos = descuento + descuentos;
                    totalDescuentos++;
                }
            } else {
                break;
            }

        }

        System.out.println("Suma total de los descuentos: " + descuentos);
        System.out.println("Media de los descuentos: " + (descuentos / totalDescuentos));
    }
}