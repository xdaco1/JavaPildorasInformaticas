import java.util.Scanner;
public class EvaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad por favor");
		
		int edad = sc.nextInt();
		sc.close();
		
		if (edad < 18) {
			System.out.println("Eres menor de edad");
		}
		else if (edad < 40){
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Cuídate");
		}

	}

}
