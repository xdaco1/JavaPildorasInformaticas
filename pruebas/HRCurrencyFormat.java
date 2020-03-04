package pruebas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HRCurrencyFormat {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
		
        // Write your code here.
        String us,india,china,france;
        
        //for US
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        us = formatter.format(payment);
        
        //for india: it doesn't exist so it's necessary to create a new Locale type.
        Locale indianCurrency = new Locale("en", "in");
        formatter = NumberFormat.getCurrencyInstance(indianCurrency);
        india = formatter.format(payment);
        
        
        //for china
        formatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = formatter.format(payment);
        
        //for france
        formatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = formatter.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
    }
	

}
