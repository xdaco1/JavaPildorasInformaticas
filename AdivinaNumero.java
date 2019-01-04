import java.util.Scanner;
public class AdivinaNumero {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aleatorio = 6; //(int)(Math.random()*100);
		int numero = -1;
		int intentos = 1;
		
		while (aleatorio != numero) {
			
			System.out.println("Introduce un numero por favor:");
			numero = sc.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("Más bajo!!");
				intentos++;
				
			} 
			else if (aleatorio > numero){
				System.out.println("Más alto!!");
				intentos++;
			} 
				
				
		}
		System.out.println("Lo conseguiste!!" + " con " + intentos + " intento(s) :)");
		
	}

}
