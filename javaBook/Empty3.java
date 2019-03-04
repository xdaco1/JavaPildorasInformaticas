package javaBook;

public class Empty3 {

	public static void main(String[] args) {
		 
		int i;
		int sum=0;
		
		//for loop without a statement but used to cumulate into "sum" variable.
		for (i=1 ; i<= 5; sum += i++);
		/*The statement sum += i++ is the same to write
		 * 
		 * sum = sum +1;
		 * i++;
		 */
		
		
		System.out.println("Sum is " + sum);

	}

}
