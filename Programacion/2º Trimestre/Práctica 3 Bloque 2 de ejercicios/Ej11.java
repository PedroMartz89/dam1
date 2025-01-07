import java.util.Vector;

public class Ej11 {
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        

        contarIntConsecutivos(vector);
    }

    public static void contarIntConsecutivos(Vector<Integer> iterado) {
        
        if (iterado == null || iterado.size() < 2) {
            System.out.println(0);
            return;
        }
        int contador = 1;
        int max = 0;
        for (int i = 1; i < iterado.size(); i++) {

            if (iterado.get(i) == iterado.get(i-1)+1) {
                
                contador ++;
            } else {
                max = Math.max(max, contador);
                contador = 1;
            }

        }

        max = Math.max(max, contador);
        System.out.println(max);
    }
}
