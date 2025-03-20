import java.util.HashMap;

public class Diccionario {

    private final HashMap<String, String> diccionario;

    public Diccionario(){
        diccionario = new HashMap<>();
    }


    public void nuevoPar(String esp, String eng) {

        diccionario.put(esp,eng);
    }

    public String traduce(String esp) {

        return diccionario.get(esp);
    }

    public String palabraAleatoria() {

        int tamano = diccionario.size();
        int numAl = (int) (Math.random() * tamano);
        return (String) diccionario.keySet().toArray()[numAl];
    }

    public char primeraLetraTraduccion(String esp) {

        String valor = diccionario.get(esp);

        return valor.charAt(0);
    }
}
