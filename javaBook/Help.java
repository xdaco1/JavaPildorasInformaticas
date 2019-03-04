package javaBook;

/*
 * Try This 3-1.
 * 
 *  A simple help system
 */

public class Help {
	
	public static void main(String [] args) 
	throws java.io.IOException{
		
		char choice;
		
		System.out.print("Help on:\n1. if\n2.switch\nChoose one:");
		
		choice = (char) System.in.read();
		
		switch (choice) {
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
			break;
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println("  case constant:");
			System.out.println("    statement sequence");
			System.out.println("    break;");
			System.out.println("  //...");
			System.out.println("}");
			break;
		default:
			System.out.println("Selection not found.");
		}
		
	}

}
