import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UtilsTest {

	@Test
	public void esTriangulo() {
		// En la variable resultado almacenamos en valor booleano de la funcion esTriangulo() y la comparamos con assertTrue, si el resultado es verdadero, sale correcto
		boolean resultado = Utils.esTriangulo(6, 8, 9);
		assertTrue(resultado, "Correcto");

	}
	
	
	@Test
	public void masFrecuenteInt() {
		int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		int[] array2 = {4, 1, 1, 1, 1, 3, 4, 4, 1, 2, 4, 9, 3};
		
	//En las variables resultado introducimos el array
		int resultado = Utils.masFrecuenteInt(array);
		int resultado2 = Utils.masFrecuenteInt(array2);
	//La función devuelve el valor que más se repite, si coincide con el número que hemos introducido sale correcto
		assertEquals(4, resultado);
		assertEquals(1, resultado2);

	}
	
	@Test
	public void tipoTriangulo() {
		
		//Comparamos cada resultado de la función con un string, si es igual sale correcto
		String resultado = Utils.tipoTriangulo(1, 2, 7);
		assertEquals("ERROR", resultado);
		
		String resultado2 = Utils.tipoTriangulo(6, 6, 6);
		assertEquals("EQUILATERO", resultado2);
		
		String resultado3 = Utils.tipoTriangulo(4, 4, 6);
		assertEquals("ISOSCELES", resultado3);
		
		String resultado4 = Utils.tipoTriangulo(4, 5, 6);
		assertEquals("ESCALENO", resultado4);

	}
	
}
