/*
*  Autor: Pedro Martínez Sánchez
*  Fecha: 03/04/2025
*  Recup. Eval2-Práctico
*  Crea un proyecto Java para gestionar información relacionada con libros, que se encuentran en el fichero adjunto.
*
* */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Libro[] libros = cargarLibros();
        mostrarLibros(libros);

        System.out.println("Libros que contienen 'novela': ");
        for (Libro libro : libros) {

            if (libro != null && libro.getPrologo().contains("novela")) {
                System.out.println("---------------------------------");
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("ISBN: " + libro.getIsbn());

            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra para buscar en el prólogo de los libros: ");
        String palabra = sc.nextLine();
        buscarPalabra(palabra, libros);

        System.out.println("Eliminando los libros con menos de 145 páginas: ");
        libros = eliminarPaginas(libros);
        mostrarLibros(libros);

        System.out.println("Comprando todos los libros: ");
        System.out.println("Total de compra = " + comprarLibros(libros));

        System.out.println("Añadiendo 2 libros: ");
        anadirLibros(libros);

        System.out.println("Rellenando el array: ");
        rellenarArray(libros);

        System.out.println("Todos los libros: ");
        mostrarLibros(libros);
    }

    //Metodo que carga los libros del fichero de texto a un array de tipo Libro
    public static Libro[] cargarLibros() {

        Libro[] libros = new Libro[15];

        try {

            File file = new File("./files/libros.txt");
            Scanner rd = new Scanner(file);
            int i = 0;
            while (rd.hasNextLine()) {

                String data = rd.nextLine();
                String[] temp = data.split("%");
                String[] validado = validarDatos(temp);

                libros[i] = new Libro(validado[0], validado[1], validado[2], validado[3], validado[4], validado[5], validado[6], validado[7]);
                i++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return libros;
    }

    //Metodo que valida los datos de los campos y pone valores por defecto si es necesario
    public static String[] validarDatos(String[] datos) {

        if (!Utilities.validarId(datos[0])) {
            datos[0] = "00-NCV";
        }
        if (!Utilities.validarISBN(datos[3])) {
            datos[3] = "9780123456789";
        }
        if (!Utilities.validarPaginas(datos[5])) {
            datos[5] = "144";
        }
        if (!Utilities.validarPrecio(datos[6])) {
            datos[6] = "19.99";
        }
        if (!Utilities.validarFecha(datos[7])) {
            datos[7] = "01/01/2000";
        }

        return datos;
    }

    //Metodo para imprimir los libros
    public static void mostrarLibros(Libro[] libros) {

        for (int i = 0; i < libros.length; i++) {

            System.out.println("Libro " + (i + 1));
            System.out.println("-------------------------------------");
            System.out.println(libros[i]);
            System.out.println();
        }
    }
    //Metodo que busca una palabra que pasamos por parametros
    public static void buscarPalabra(String palabra, Libro[] libros) {

        System.out.println("Libros que contienen '" + palabra + "':");
        for (Libro libro : libros) {
            int ocurrencias = 0;
            //no recuerdo la funcion para que se asegure de que la palabra sea tal cual la que escribes
            if (libro != null && libro.getPrologo().contains(palabra)) {

                String[] prologo = libro.getPrologo().split(" ");
                for (String s : prologo) {
                    if (s.equals(palabra)) {
                        ocurrencias++;
                    }
                }
                System.out.println("---------------------------------");
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Número de ocurrencias: " + ocurrencias);

            }
        }
    }
    //metodo que elimina los libros cuyas paginas sean menores a 145
    public static Libro[] eliminarPaginas(Libro[] libros) {

        for (int i = 0; i < libros.length; i++) {

            if (libros[i] != null) {
                int numPaginas = Integer.parseInt(libros[i].getNumPaginas());
                if (numPaginas < 145) {
                    libros[i] = null;
                }

            }

        }
        return libros;
    }
    //metodo que simula la compra de todos los libros y devuelve un double con el precio total
    public static double comprarLibros(Libro[] libros) {

        double total = 0;
        for (Libro libro : libros) {

            if (libro != null) {
                double precio = Double.parseDouble(libro.getPrecio());
                total = total + precio;

            }
        }

        return total;
    }
    //metodo que añade 2 libros al array
    public static Libro[] anadirLibros(Libro[] libros) {
        int contador = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null && contador < 2) {

                String[] validado = pedirDatos();
                libros[i] = new Libro(validado[0], validado[1], validado[2], validado[3], validado[4], validado[5], validado[6], validado[7]);
                contador++;
            }

        }

        return libros;
    }
    //Metodo que se encarga de pedir los datos de los libros al cliente
    public static String[] pedirDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce identificador: ");
        String identificador = sc.nextLine();
        System.out.println("Introduce el título: ");
        String titulo = sc.nextLine();
        System.out.println("Introduce el autor: ");
        String autor = sc.nextLine();
        System.out.println("Introduce el ISBN");
        String isbn = sc.nextLine();
        System.out.println("Introduce el prólogo");
        String prologo = sc.nextLine();
        System.out.println("Introduce el número de páginas: ");
        String numPaginas = sc.nextLine();
        System.out.println("Introduce el precio: ");
        String precio = sc.nextLine();
        System.out.println("Introduce la fecha de edición: ");
        String fechaEdicion = sc.nextLine();

        String[] datos = new String[8];
        datos[0] = identificador;
        datos[1] = titulo;
        datos[2] = autor;
        datos[3] = isbn;
        datos[4] = prologo;
        datos[5] = numPaginas;
        datos[6] = precio;
        datos[7] = fechaEdicion;

        return validarDatos(datos);
    }
    //Metodo que rellena el array con libros cuyos datos se piden por teclado
    public static Libro[] rellenarArray(Libro[] libros) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < libros.length; i++) {

            if (libros[i] == null) {
                System.out.println("Para dejar de añadir libros pulse 0");
                System.out.println("Si desea continuar pulse 1");
                System.out.print("\nDesea continuar?: ");
                int opcion = sc.nextInt();
                if (opcion == 0) {
                    break;
                } else {
                    String[] validado = pedirDatos();
                    libros[i] = new Libro(validado[0], validado[1], validado[2], validado[3], validado[4], validado[5], validado[6], validado[7]);
                    if (i == libros.length - 1) {

                        System.out.println("Ya no caben más libros");
                        System.out.println("Pulsa enter para continuar");
                        sc.nextLine();
                    }
                }

            }

        }

        return libros;
    }
}