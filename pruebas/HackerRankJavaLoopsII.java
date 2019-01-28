package pruebas;

import java.util.Scanner;

public class HackerRankJavaLoopsII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int acumulado = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //Aunque se escriban los enteros en la misma línea separados
            //por espacio en blanco se asigna cada número a su respectiva variabla
            for(int j=0;j<n;j++) {
            	
            	if(j==0) {
            		acumulado = (a + (int)Math.pow(2, j) * b);
            	}
            	else {
            		acumulado = acumulado + (int)Math.pow(2, j) * b;
            	}
            	
            	System.out.print(acumulado + " ");
            	
            }
            System.out.println();
            
        }
        in.close();
			
		}
}

