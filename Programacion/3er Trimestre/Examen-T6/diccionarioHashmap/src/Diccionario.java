import java.util.HashMap;

public class Diccionario {

    public HashMap<String,String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void nuevoPar(String clave, String valor) {

        diccionario.put(clave, valor);
    }

    public String traduce(String palabra) {

        return diccionario.get(palabra);

    }

    public String palabraAleatoria() {
        int size = diccionario.size();
        int numRandom = (int) (Math.random() * size);
        return (String) diccionario.keySet().toArray()[numRandom];
    }

    public char primeraLetraTraduccion(String palabra) {

        return diccionario.get(palabra).charAt(0);
    }
}
