/*

	Crea un código java que reproduzca la siguiente secuencia:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1 
	
	Autor: Pedro Martínez Sánchez
*/

public class Ej2 {

	public static void main(String[] args) {
		
		int temp = 1;

		for (int i = 1; i < 7 ; i++ ) {
			
			for (int j = 1; j <= i  ; j++ ) {
				
				System.out.print(j);
	
			}
			
			System.out.println();
		}


		for (int i = 5; i >= 1 ; i = i - 1 ) {
			
			for (int j = i; j >= 1 ; j = j - 1 ) {
				
				temp = i;

				System.out.print(temp);
			}
			System.out.println();
		}
	}
}