package pruebas;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = Double.parseDouble(scan.next());
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}