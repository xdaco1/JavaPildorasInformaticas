package pruebas;

//https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

import java.util.Scanner;
import java.lang.Exception;


public class StaticInitBlockParalellogram {

	static boolean flag = false;
	static int B=0;
	static int H=0;
	
	static {
		
		Scanner sc = new Scanner(System.in);
		
		B=sc.nextInt();
		H=sc.nextInt();
		
		try {
			
			if (B <=0 || H <=0 ) {
				
				throw new java.lang.Exception("Breadth and height must be positive");
			}
			else {
				flag=true;
			}
			
		}catch (Exception e) {
			
			System.out.println(e);
			
		}
		finally {
			sc.close();
		}
		
	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main
	
}
