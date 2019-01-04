import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba 	= 	0;
		int punto	=	0;
		
		String 	email = JOptionPane.showInputDialog("Introduce tu correo electrónico:");
		
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
