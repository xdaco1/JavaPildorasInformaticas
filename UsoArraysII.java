import javax.swing.JOptionPane;

public class UsoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String [] paises = new String[8];
		
		paises[0]= "Espa�a";
		paises[1]= "M�xico";
		paises[2]= "Colombia";
		paises[3]= "Per�";
		paises[4]= "Chile";
		paises[5]= "Argentina";
		paises[6]= "Ecuador";
		paises[7]= "Venezuela";
		*/
		
		/*
		  for (int i = 0; i < paises.length; i++) {
		 
			System.out.println("Pa�s: " + (i+1) + " " + paises[i]);
			
		}
		*/
		
		/*
		String [] paises = {"Espa�a","M�xico","Colombia","Per�","Chile","Argentina","Ecuador","Venezuela"};
		
		for (String elemento : paises) {
			System.out.println(elemento);
		}
		*/
		
		/*
		String [] paises= new String[8];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce Pa�s " + (i+1));
		}
		
		for (String pais : paises) {
			System.out.println("Pa�s " + pais );
			
		}
		*/
		
		int [] matrizRandom = new int[150];
		
		for (int i = 0; i < matrizRandom.length; i++) {
			matrizRandom[i] = (int)(Math.random()*100);
		}
		
		for (int numeroMatriz : matrizRandom) {
			System.out.print(numeroMatriz + "\t");
		}
		
		
	}

}
