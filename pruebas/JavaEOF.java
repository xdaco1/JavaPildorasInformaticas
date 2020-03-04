package pruebas;

import java.util.Scanner;


public class JavaEOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner sc = new Scanner(System.in);
    	int index = 1;
    	
    	while (sc.hasNext()) {
			System.out.println(index + " " + sc.nextLine());
			index++;
		}
    	
    	sc.close();
    }
}