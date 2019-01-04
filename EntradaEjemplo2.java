import javax.swing.JOptionPane;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad por favor"));
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene tendrás " + (edad + 1) + " años");

	}

}
