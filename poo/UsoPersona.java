package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona2 lasPersona2s [] = new Persona2[2];
		lasPersona2s[0] = new Empleado2("jairo", 10000, 2010, 02, 20);
		lasPersona2s[1] = new Alumno("juan", "biología");
		
		for (Persona2 p : lasPersona2s) {
			
			System.out.println(p.getNombre() + ", "+ p.getDescripcion());
			
		}
	}

}

 abstract class Persona2{ //Una clase abstracta es la que marca la jerarquía en el diseño de la herencia
	
	public Persona2(String nom) {
		nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public abstract String getDescripcion();
	
	private String nombre;
	
}

class Empleado2 extends Persona2{
	
	public Empleado2(String nom,double sue, int anio, int mes, int dia) {
		
		super(nom);
		sueldo	=	sue;
		GregorianCalendar calendario =	new GregorianCalendar(anio,mes-1,dia);
		altaContrato = calendario.getTime();
		id = idNext;
		idNext++;
	}
	
	public String getDescripcion() {
		return "Este empleado tiene el id: " + id +
				" con el sueldo: " + sueldo;
	}
	
	public /*final Si se usa esta clausula, este método no podrá sobre-escribirse en las subclases*/ 
		double getSueldo() {
		
		return sueldo;
	}
	
	public Date getFechaAlta() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
		
	}
	
	public int getId() {
		return id;
	}
	
	private	double 	sueldo;
	private Date	altaContrato;
	private	static 	int		idNext = 1;
	private int		id;
}

class Alumno extends Persona2{
	
	public Alumno(String nom, String car){
		
		super(nom);
		carrera = car;
		
	}
	
	public String getDescripcion() {
		return "El estudiante " + " estudia " + carrera;
	}
	
	private String carrera;
}
	