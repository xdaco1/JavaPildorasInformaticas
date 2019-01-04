
public class CalculosConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz = Math.sqrt(9);
		//System.out.println(Integer.raiz);
		
		double num1=5.85;
		int resultado = (int)Math.round(num1); //Refundición se trunca el valor retornado en long en int.
		//System.out.println(resultado);
		
		double base=5;
		double exponente=3;
		int resultadoPow = (int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " +resultadoPow);

	}

}
