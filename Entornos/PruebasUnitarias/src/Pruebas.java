
public class Pruebas {
	
	public static void main(String[] args) {
        // Prueba de tipoTriangulo: verifica los diferentes tipos de triángulos
        System.out.println(Utils.tipoTriangulo(3, 4, 5)); // ESCALENO si todos los lados son diferentes
        System.out.println(Utils.tipoTriangulo(3, 3, 3)); // EQUILATERO si todos los lados son iguales
        System.out.println(Utils.tipoTriangulo(3, 3, 5)); // ISOSCELES si tiene dos lados iguales
        System.out.println(Utils.tipoTriangulo(1, 2, 3)); // ERROR porque la suma de la longitud de cada lado es menor a la de la longitud de los otros lados

        //masFrecuenteInt: determina el elemento que más se repite
        System.out.println(Utils.masFrecuenteInt(new int[]{4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3})); // 4

        //buscarInt: busca la posición de un valor en el array
        System.out.println(Utils.buscarInt(new int[]{10, 20, 30, 40, 50}, 30)); // 2
        System.out.println(Utils.buscarInt(new int[]{10, 20, 30, 40, 50}, 60)); // -1
    }
}

