import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		entrada.close();
		
		System.out.println("El usuario " + nombreUsuario + " tiene " + edad + " años");

	}

}
