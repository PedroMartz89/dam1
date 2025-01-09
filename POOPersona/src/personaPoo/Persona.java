package personaPoo;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	
	public String nombreCompleto() {
		
		
		return this.nombre + " " + this.apellido1 + " " + this.apellido2 + " con DNI" + this.dni;
	}


	public Persona(String dni, String nombre, String apellido1, String apellido2) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;

	}
	
	
	
}
