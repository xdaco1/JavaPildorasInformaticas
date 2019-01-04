
public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte largo = 4;
		byte alto = 5;
		int [][] matrix = new int [largo][alto];
		
		/*
		for (int i = 0; i < largo; i++) {
			System.out.println();
			for (int j = 0; j < alto; j++) {
				matrix[i][j] = (int)(Math.random()*100);
				System.out.print(matrix[i][j] + "\t");
			}
		}
		*/
		
		for (int[] fila : matrix) {
			System.out.println();
			for (int columna : fila) {
				
				System.out.print((int)(Math.random()*100) + "\t");
				
			}
		}
	}

}
