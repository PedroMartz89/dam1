public class Utils {
    public static boolean esTriangulo(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String tipoTriangulo(int a, int b, int c) {
        if (!(esTriangulo(a,b,c))) {
        	
        	String resultado = "ERROR";
        	return resultado;
        }
        if (a == b && b == c) {
        	
        	return "EQUILATERO";
        }
        if (a == b || a == c || b == c) return "ISOSCELES";
        return "ESCALENO";
    }

    public static Integer masFrecuenteInt(int[] array) {
    		
    	int maximo = array[0];
    	int frecuenciaMax = 0;
    	
    	for (int i = 0; i < array.length; i++) {
    		
    		int actual = 0;
    		
    		for (int j = 0; j < array.length; j++) {
    			
    			if (array[i] == array[j]) {
    				
    				actual++;
    			}
    			
    		}
    	
    	if (actual > frecuenciaMax) {
    		
    		frecuenciaMax = actual;
    		maximo = array[i];
    	}

    	}
		return maximo;
    }

    public static int buscarInt(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) return i;
        }
        return -1;
    }

}
