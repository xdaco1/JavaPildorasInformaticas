import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Daniel";
		String pass= "";
		
		while(clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Introduce la contrase�a");
			
			if(clave.equals(pass) == false) {
				System.out.println("Contrase�a Incorrecta");
			}
		}
		
		System.out.println("Contrase�a correcta. Acceso permitido");

	}

}
