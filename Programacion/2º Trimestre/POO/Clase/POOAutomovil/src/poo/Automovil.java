package poo;

public class Automovil {
	
	private String marca;
	private String modelo;
	private String color;
	private int cilindrada;
	
	
	public void establecerMarca(String mar) {
	
				
		this.marca = mar;		
	}
	
	public void establecerModelo(String mod) {
		
		
		this.modelo = mod;		
	}
	
	public void establecerColor(String color) {
		
		
		this.color = color;		
	}
	
	public void establecerCilindrada(int cil) {
		
		
		this.cilindrada = cil;		
	}
	
	public String detalle() {
		
		
		String texto= "";
		
		texto = "Auto - Marca: " + this.marca + "\nAuto - Modelo:" + this.modelo + "\nAuto - color: " + this.color + "\nAuto - cilindrada: "+ this.cilindrada;
		return texto;
	}
	
	public String acelerar(int velocidad) {
		
		return "El coche " + this.marca + " " + this.modelo + " está acelerando a " + velocidad;
		
	}
	
	public String frenar(double tiempo) {
		
		
		return "El automóvil " + this.marca + " " + this.modelo + " ha frenado en " + tiempo + " segundos";
	}
}

