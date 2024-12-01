public class HolaMundo {
  public static void main(String[] args) {
    System.out.println("Hello World");

    int MiVariable = 7;
    System.out.println(MiVariable);

   	String nombre = new String();
   	nombre = "Mi cadena de texto";
   	System.out.println(nombre);


   	Number aux0 = 340.47;
   	int aux1 = aux0.intValue();
   	System.out.println(aux1);

   	String aux3="555";
   	int aux4 = Integer.parseInt(aux3);
   	System.out.println(aux4);
   	System.out.println(aux3);

   	Integer a = new Integer(500);
	Integer b = new Integer("500");
	Float c = new Float(7.5f);
	Float d = new Float("7.5f");
	Double e = new Double(3.14159);
	Double f = new Double("314159E-5");
	Character g = new Character('t');
  }
}

