import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Daniel";
		String pass= "";
		
		while(clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Introduce la contraseña");
			
			if(clave.equals(pass) == false) {
				System.out.println("Contraseña Incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
