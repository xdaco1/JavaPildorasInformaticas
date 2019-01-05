package poo;

import java.util.Date;
import java.util.GregorianCalendar;

//import javax.swing.JOptionPane;

public class usoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleado emp1 = new Empleado("daniel Calderon",10000,2017,10,30);
		Empleado emp2 = new Empleado("maria perez",20000,2018,10,30);
		Empleado emp3 = new Empleado("fabian ramirez",30000,2016,10,30);
		
		emp1.subeSueldo(5);
		emp2.subeSueldo(7);
		emp3.subeSueldo(6);
		
		System.out.println("Nombre:" + emp1.getNombre() + "\tSueldo: " + emp1.getSueldo() + "\tFecha alta: " + emp1.getFechaAlta());
		System.out.println("Nombre:" + emp2.getNombre() + "\tSueldo: " + emp2.getSueldo() + "\tFecha alta: " + emp2.getFechaAlta());
		System.out.println("Nombre:" + emp3.getNombre() + "\tSueldo: " + emp3.getSueldo() + "\tFecha alta: " + emp3.getFechaAlta());
		*/
		
		Jefatura jefeRRHH = new Jefatura("Albert Motoa");
		jefeRRHH.setIncentivo(1000);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("daniel Calderon",1000,2017,10,30);
		misEmpleados[1] = new Empleado("maria perez",20000,2018,10,30);
		misEmpleados[2] = new Empleado("fabian ramirez",30000,2016,10,30);
		misEmpleados[3]	= new Empleado("andres vega");
		misEmpleados[4] = jefeRRHH; //Polimorfismo, principio de sustitución
			//Se puede utilizar un objeto de la subclase siempre que el programa espere un 
			//objeto de la super clase. El array espera un objeto de tipo empleado, que por
			//herencia está contenido en el tipo Jefatura y objeto jefeRRHH.
		misEmpleados[5] = new Jefatura("Maria Sanchez");
		
		for (int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].subeSueldo(5);
			System.out.println(
								"Nombre: " + misEmpleados[i].getNombre() + 
								"\tSueldo: " + misEmpleados[i].getSueldo() + 
								"\tFecha Alta: " + misEmpleados[i].getFechaAlta()
							  );
		}
		
		System.out.println();
		
		for (Empleado i : misEmpleados) {
			
			/* Este bucle es un ejemplo del comportamiento variable (o polimórfico) pues cuando
			 * se recorre en el array los de tipo Jefatura usa el método subeSueldo de Empleado
			 * pero usa getSueldo de Jefatura.
			 * La JVM identifica de manera automática qué método de qué clase debe usar, a esto
			 * se le llama enlazado dinámico, esto en tiempo de ejecución.
			*/ 
			
			i.subeSueldo(5);
			System.out.println(
								"Nombre: " + i.getNombre() + 
								"\tSueldo: " + i.getSueldo() + 
								"\tFecha Alta: " + i.getFechaAlta()
							  );
		}
	}

}

class Empleado{
	
	public Empleado(String nom,double sue, int anio, int mes, int dia) {
		
		nombre 	=	nom;
		sueldo	=	sue;
		GregorianCalendar calendario =	new GregorianCalendar(anio,mes-1,dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nombre) {
		
		this(nombre,20000,0001,01,01); //Invoca al primer constructor
		
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public double getSueldo() {
		
		return sueldo;
	}
	
	public Date getFechaAlta() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
		
	}
	
	private String 	nombre;
	private	double 	sueldo;
	private Date	altaContrato;
}

class Jefatura extends Empleado {
	
	public Jefatura (String nom) {
		super(nom);
	}
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public double getSueldo() { //este metodo sobre-escribe para esta clase el heredado.
		double sueldoJefe = super.getSueldo(); // aunque se invalida el metodo de la clase padre, 
			//no necesariamente quiere decir que no se pueda usar. En este caso, "super." instruye a que utilice
			//el método de la clase padre.
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
}