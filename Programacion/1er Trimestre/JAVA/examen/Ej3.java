/*

	Escribe un programa python que solicite por pantalla 2 números enteros e imprima las tablas de multiplicar del 10 al 1 entre ellos. (3 puntos)

    Deberá controlar que ambos números sean enteros positivos, y el segundo número mayor que el primero. Si no es así, deberá continuar pidiendo números hasta que se cumpla la condición o se pulse 0 (el programa finaliza).
    Debe mostrar un texto y una línea de separación precediendo cada tabla (como se indica en el ejemplo)
    La salida por pantalla, si los números que se introducen son 2 y 3, debería ser ésta:

La tabla de multiplicar del 2, desde el 10 hasta el 1, es:

------------------------------------------------------------------

2x10=20

2x9=18

2x8=16

2x7=14

2x6=12

2x5=10

2x4=8

2x3=6

2x2=4

2x1=2

La tabla de multiplicar del 3, desde el 10 hasta el 1, es:

------------------------------------------------------------------

3x10=30

3x9=27

3x8=24

3x7=21

3x6=18

3x5=15

3x4=12

3x3=9

3x2=6

3x1=3

*/

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		int valor1, valor2, total;
		Scanner teclado = new Scanner(System.in);
		boolean condicion = false;

		while (!condicion) {


			System.out.print("Introduce el primer valor --> ");
			valor1 = teclado.nextInt();


			System.out.print("Introduce el segundo valor --> ");
			valor2 = teclado.nextInt();

				if (valor1 > 0 && valor2 > 0 && valor2 > valor1) {
				
					condicion = true;
					for (int i = valor1; i < valor2+1; i++ ) {
						System.out.println("-----------------------");
						System.out.printf("Tabla del %d\n", i);
						System.out.println("-----------------------");

					for (int j = 10; j > 0 ; j-- ) {
						
						total = i * j;	

						System.out.printf("%d x %d = %d\n",i,j,total);
					}
				}

			} else {

				System.out.println("Los números introducidos no cumplen los requisitos.");
			}
		
		}	
	}
}