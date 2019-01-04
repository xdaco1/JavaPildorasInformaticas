import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para el factorial"));
		long factorial = 1L;
		
		for (int i = numero; i > 0 ; i--) {
			
			factorial = factorial * i;
			
		}
		
		System.out.println("El factorial de " + numero + " es: " + factorial);

	}

}
