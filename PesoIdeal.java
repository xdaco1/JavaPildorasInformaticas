import javax.swing.JOptionPane;
public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
			
		} while (genero.equalsIgnoreCase("H") == false 
				&& genero.equalsIgnoreCase("M") == false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en centímetros:"));
		
		int pesoIdeal = 0;
		
		if (genero.equalsIgnoreCase("H")) {
			
			pesoIdeal = altura - 100;
			
		}
		else if (genero.equalsIgnoreCase("M")) {
			
			pesoIdeal = altura-120;
			
		}
		
		System.out.println("Tu peso idel es: " + pesoIdeal + " kg.");
	}

}
