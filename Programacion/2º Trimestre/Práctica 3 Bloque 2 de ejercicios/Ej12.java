import java.util.Vector;

public class Ej12 {
    
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        

        System.out.println(yaOrdenadoInt(vector));
    }

    public static boolean yaOrdenadoInt(Vector<Integer> iterado) {

        for (int i = 1; i < iterado.size(); i++) {
            
            if (iterado.get(1) < iterado.get(i - 1)) {

                System.out.println("correcto");
                System.out.println(i);
                
            }
        }
                return true;
    }
}
