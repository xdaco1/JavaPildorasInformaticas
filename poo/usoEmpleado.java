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
		
		Empleado[] misEmpleados = new Empleado[4];
		
		misEmpleados[0] = new Empleado("daniel Calderon",1000,2017,10,30);
		misEmpleados[1] = new Empleado("maria perez",20000,2018,10,30);
		misEmpleados[2] = new Empleado("fabian ramirez",30000,2016,10,30);
		misEmpleados[3]	= new Empleado("andres vega");
		
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