package poo;

public class Main {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		
		auto.establecerMarca("Kia");
		auto.establecerModelo("Stonic");
		auto.establecerColor("Naranja");
		auto.establecerCilindrada(1800);
		
		System.out.println(auto.detalle());
		System.out.println(auto.acelerar(120));
		
		System.out.println(auto.frenar(15));
		
	}
	
}
