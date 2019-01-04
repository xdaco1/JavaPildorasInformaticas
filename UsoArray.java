
public class UsoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)(Math.random()*100);
			
			System.out.println(numeros[i]);
		}
		
	}

}
