

public class Array5 {
    
    public static void main(String[] args) {
        
       mostrarArray(crearArray(10));
        
        
    }

    public static int[] crearArray(int size) {

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = 7;
        }

        return array;
    }

    public static void mostrarArray(int[] array) {

        System.out.println("Array: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}

