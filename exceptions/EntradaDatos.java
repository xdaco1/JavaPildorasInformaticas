package exceptions;

import java.util.*;
public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			
			try {
				pedirDatos();
			} catch (Exception e) {
				System.out.println("no introdujiste bien los datos");
			}
			
			
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
		static void pedirDatos() throws InputMismatchException { //No se considera buena práctica lanzar la excepción si el código puede construirse mejor			
		
			//try {
			Scanner entrada=new Scanner(System.in);
			
			System.out.println("Introduce tu nombre, por favor");
			
			String nombre_usuario=entrada.nextLine();
			
			System.out.println("Introduce edad, por favor");
			
			int edad=entrada.nextInt();	

			System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
			
			entrada.close();
			
			//}catch(Exception e) {//ha de capturar la excepción del throws o de una superclase
			//	System.out.println("no introdujiste bien los datos");
			//}
		
		
		System.out.println("Hemos terminado");
		
	}
		
		
}