package exceptions;
import java.io.EOFException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CompruebaEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String 	email = JOptionPane.showInputDialog("Introduce tu correo electr�nico:");
		
		examinaEmail(email);

	}
	
	static void examinaEmail(String email) throws ArrayIndexOutOfBoundsException{ //al agregar una clausula throw dentro del cuerpo del programa, 
		//ha de agregarse el throws en el header para indicar que el m�todo puede lanzar una excepci�n
	
		int arroba 	= 	0;
		int punto	=	0;
		
		if(email.length() <= 3) { //Se revisa el input para generar una excepci�n en caso que no cumpla con un m�nimo de longitud.
			
			//Generaci�n manual de la excepci�n
			
			//Recordar: la excepci�n es un objeto que hereda de RunTimeException y no de IOException, no es necesario gestionar el try-catch.
			
			//Opcion1: ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
			//throw miExcepcion;
			
			//Opcion2:
			throw new ArrayIndexOutOfBoundsException();
			
		}else {
		
			for (int i = 0; i < email.length(); i++) {
				
				if ('@' == email.charAt(i)) {
					arroba++;
				}
				else if ('.' == email.charAt(i)){
					punto++;
				};
				
			}
			
			if (arroba == 1 && punto >= 1) {
				
				System.out.println("Es correcto");
				
			}else {
				System.out.println("No es correcto");
			}
		}
	}

}