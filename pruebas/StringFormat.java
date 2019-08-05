package pruebas;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Codigo"; 
		String apellido = "Facilito";
		int	dias = 10;
		float fraccion = 0.5f;
		boolean avance = true;
		
		System.out.printf("%s %s %d con %f horas. Avance: %b",nombre,apellido,dias,fraccion,avance);
		
		//orden
		
		System.out.printf("\nCambio de orden: %2$s, %1$s. %5$b %4$.2f %3$d",nombre,apellido,dias,fraccion,avance);
		
	}

}
