package pruebas;

import java.util.Scanner;

public class IntToString {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int intValue = sc.nextInt();
		String s = Integer.toString(intValue);
		
		try {
			
			intValue=Integer.parseInt(s);
			
			
		} catch (Exception e) {
			
		}
		finally {
			sc.close();
		}
		
	}
	
}
