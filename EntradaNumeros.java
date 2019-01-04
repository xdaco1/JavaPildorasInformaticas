import javax.swing.JOptionPane;
public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 = JOptionPane.showInputDialog("ingresa un numero");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num1 + " es: ");
		System.out.printf("%1.2f", Math.sqrt(num2));
		//System.out.printf("%1.2f",x/3);

	}

}
