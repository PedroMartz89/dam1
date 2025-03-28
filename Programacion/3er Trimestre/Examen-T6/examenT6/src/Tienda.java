import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    private String nombre;
    private String direccion;
    private String propietario;
    private String edad;
    private Boolean descuento;

    public Tienda(String nombre, String direccion, String propietario, String edad, Boolean descuento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.propietario = propietario;
        this.edad = edad;
        this.descuento = descuento;
    }

    public Tienda() {
    }


    //Metodo que lee un fichero y añade su informacion a objetos Tienda que devuelve con un ArrayList
    public ArrayList<Tienda> anadirTiendas() {

        ArrayList<Tienda> tiendas = new ArrayList<>();
        try {

            File fichero = new File("assets/tiendas.txt");
            Scanner reader = new Scanner(fichero);

            while (reader.hasNextLine()) {
                String linea = reader.nextLine();
                String[] datos = linea.split("#");
                boolean descuento = false;

                int edadInt = Integer.parseInt(datos[datos.length-1]);
                if (edadInt > 55) {
                    tiendas.add(new Tienda(datos[0],datos[1],datos[2],datos[3],true));
                } else {
                    tiendas.add(new Tienda(datos[0],datos[1],datos[2],datos[3],false));
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return tiendas;
    }

    @Override
    public String toString() {
        return  "\n   Nombre: "+ nombre;
    }
}
