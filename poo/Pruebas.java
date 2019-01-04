package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados emp1 = new Empleados("daniel");
		Empleados emp2 = new Empleados("juan");
		Empleados emp3 = new Empleados("pedro");
		
		emp1.setSeccion("analisis");
		System.out.println(emp1.getEmpleado());
		System.out.println(emp2.getEmpleado());
		
		System.out.println(emp3.getEmpleado());

	}

}

class Empleados {
	//Variables de clase
	private static int idNext = 1;
	//Constantes de objeto
	private final String nombre;
	//Variables de objeto
	private String seccion;
	private int id;
	
	
	public Empleados(String nom){
		nombre=nom;
		seccion="Administracion";
		id = idNext;
		idNext++;
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getEmpleado() {
		
		return "El nombre es: " + nombre + " y la seccion es: " + seccion + " y el id es: " + id;
		
	}
	
}