package poo;

import java.util.Arrays;
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
		
		//Casting de objetos
		// En este escenario sucede por "referencia".
		Jefatura jefeFinanzas = (Jefatura)misEmpleados[5];
		jefeFinanzas.setIncentivo(50000);
		
		//La asignación anterior no necesariamente va a funcionar con otro objeto del array
		//que no sea del tipo Jefatura.
		//El siguiente código genera error, por ello se deja inhabilitado pero como muestra.
		//Jefatura jefeAdministrativo = (Jefatura)misEmpleados[1];

		
		/*
		for (int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].subeSueldo(5);
			System.out.println(
								"Nombre: " + misEmpleados[i].getNombre() + 
								"\tSueldo: " + misEmpleados[i].getSueldo() + 
								"\tFecha Alta: " + misEmpleados[i].getFechaAlta()
							  );
		}
		
		System.out.println();
		*/
		
		//[Interfaces] Se plantea organizar el array previo a su proceso e impresion.
		//Para usar el método sort, siendo estático, se invoca directamente desde su clase
		//la API menciona que el el elemento debe implementar la interfaz Comparable.
		
		Arrays.sort(misEmpleados);
		
		//[Interfaces] Se ha organizado el array según su orden natural, este se ha determinado en la
		// implementación del método compareTo a través del atributo sueldo.
		
		for (Empleado i : misEmpleados) {
			
			/* Este bucle es un ejemplo del comportamiento variable (o polimórfico) pues cuando
			 * se recorre en el array los de tipo Jefatura usa el método subeSueldo de Empleado
			 * pero usa getSueldo de Jefatura.
			 * La JVM identifica de manera automática qué método de qué clase debe usar, a esto
			 * se le llama enlazado dinámico, esto en tiempo de ejecución.
			*/ 
			
			i.subeSueldo(5);
			System.out.println(
								"id: " + i.getId() + 
								"\tNombre: " + i.getNombre() + 
								"\tSueldo: " + i.getSueldo() + 
								"\tFecha Alta: " + i.getFechaAlta()
							  );
		}
		
		//System.out.println(jefeFinanzas.getSueldo()); //El valor tanto en el array como en el objeto son los mismos "por referencia".
	}

}

class Empleado implements Comparable{ //[Interfaces] Se implementa la interfaz Comparable
	/*	[Interfaces]
	 	Determinan el comportamiento de las clases que la implementan.
		No se pueden instanciar.
		Todos sus métodos son public abstract (aún cuando no se especifique) y no implementados (constuidos).
		No tienen variables, sí constantes.
		
		En la práctica, tiene similitudes con una clase abstracta, sin embargo, hay que tener en cuenta
		que Java no permite la herencia múltiple. Las interfaces solventan esta limitante. 
	 */
	
	public Empleado(String nom,double sue, int anio, int mes, int dia) {
		
		nombre 	=	nom;
		sueldo	=	sue;
		GregorianCalendar calendario =	new GregorianCalendar(anio,mes-1,dia);
		altaContrato = calendario.getTime();
		id = idNext;
		idNext++;
	}
	
	public Empleado(String nombre) {
		
		this(nombre,20000,0001,01,01); //Invoca al primer constructor
		
	}
	
	//[Interfaces] La interfaz Comparable obliga a implementar el método compareTo.
	public int compareTo(Object miObjeto) { 
		
		Empleado otroEmpleado = (Empleado)miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	};
	
	public String getNombre() {
		
		return nombre;
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
	
	private String 	nombre;
	private	double 	sueldo;
	private Date	altaContrato;
	private	static 	int		idNext = 1;
	private int		id;
}

final class Jefatura extends Empleado { //el uso de final aquí impide que esta clase sea superclase. Se termina con la cadena de herencia.
	
	public Jefatura (String nom) {
		super(nom);
	}
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public double getSueldo() { //este metodo sobre-escribe para esta clase el heredado.
		//En caso que el método de la super clase sea "final" no se podrá llevar a cabo la sobre-escritura
		//y será necesario usar otro nombre.
		double sueldoJefe = super.getSueldo(); // aunque se invalida el metodo de la clase padre, 
			//no necesariamente quiere decir que no se pueda usar. En este caso, "super." instruye a que utilice
			//el método de la clase padre.
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
}