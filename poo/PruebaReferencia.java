package poo;

public class PruebaReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona pedro = new Persona("pedro",21);
		Persona maria = pedro;
		Padre juan = new Padre("juan",55,2);
		
		System.out.println(pedro.getPersona());
		System.out.println(maria.getPersona());
		
		maria.setEdad(5);
		System.out.println(maria.getPersona());
		
		maria = new Persona("maria",30);
		System.out.println(maria.getPersona());
		
		Persona [] personas = new Persona[2];
		personas[0] = maria;
		
		personas[0].setEdad(100);
		System.out.println(personas[0].getPersona());
		System.out.println(maria.getPersona());
		
		personas[1]=(Persona)juan;
		System.out.println(personas[1].getPersona());
		System.out.println(juan.getPadre());
		
		juan.setEdad(70);
		System.out.println(personas[1].getPersona());
		System.out.println(juan.getPadre());
		
		int abc = 6;
		System.out.println(abc);
		int def = abc;
		System.out.println(def);
		def = 999;
		System.out.println(abc);
		System.out.println(def);
	}

}

class Persona {
	private String nombre;
	private int	edad;
	
	public Persona(String nombre,int edad) {
		this.nombre =nombre;
		this.edad= edad;
	}
	
	public String getPersona() {
		return nombre + " años: " + edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}

class Padre extends Persona{
	private int hijos;
	
	public Padre(String nombre,int edad,int hijos) {
		super(nombre,edad);
		this.hijos = hijos;
	}
	
	public String getPadre() {
		return super.getPersona() + " hijos: " + hijos;
	}
	
}