import javax.swing.JOptionPane;

public class UsoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String [] paises = new String[8];
		
		paises[0]= "España";
		paises[1]= "México";
		paises[2]= "Colombia";
		paises[3]= "Perú";
		paises[4]= "Chile";
		paises[5]= "Argentina";
		paises[6]= "Ecuador";
		paises[7]= "Venezuela";
		*/
		
		/*
		  for (int i = 0; i < paises.length; i++) {
		 
			System.out.println("País: " + (i+1) + " " + paises[i]);
			
		}
		*/
		
		/*
		String [] paises = {"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};
		
		for (String elemento : paises) {
			System.out.println(elemento);
		}
		*/
		
		/*
		String [] paises= new String[8];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce País " + (i+1));
		}
		
		for (String pais : paises) {
			System.out.println("País " + pais );
			
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
