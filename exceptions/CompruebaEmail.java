package exceptions;
import java.io.EOFException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CompruebaEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String 	email = JOptionPane.showInputDialog("Introduce tu correo electrónico:");
		
		try {
			examinaEmail(email);
		} catch (Exception e) {
			System.out.println("La dirección de email: " + email + " no es correcta");
		}
		

	}
	
	static void examinaEmail(String email) throws EOFException{  
	
		int arroba 	= 	0;
		int punto	=	0;
		
		if(email.length() <= 3) { 

			throw new EOFException();
			
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