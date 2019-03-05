package javaBook;

public class ControlToLabel {

	public static void main(String[] args) {
		
		outerLoop:
			for (int i = 1; i < 10; i++) {
				
				System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
				
				for (int j = 1; j < 10; j++) {
					
					if(j==5) continue outerLoop; //continue outer loop
					System.out.print(j);
					
				}
				
			}

	}

}
