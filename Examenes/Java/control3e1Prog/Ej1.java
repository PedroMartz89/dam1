/*
	Clase Ej1.java
	Escribe una clase java que solicite como datos de entrada una hora expresada en horas, minutos y segundos, y calcule y escriba la hora, minutos y segundos que serán cuando haya transcurrido un segundo.
	Autor: Pedro Martínez Sánchez

*/

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, totalh, totalm,totals;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce horas --> ");
		horas = teclado.nextInt();
		System.out.print("Introduce minutos --> ");
		minutos = teclado.nextInt();
		System.out.print("Introduce segundos --> ");
		segundos = teclado.nextInt();

		totals = (horas*3600) + (minutos * 60 ) + segundos + 1;

		totalh = totals / 3600;
		totalm = totals / 60;

		System.out.printf("Horas: %d Minutos: %d Segundos: %d ",totalh,totalm,totals);
		System.out.println();

	}

}