import java.util.Scanner;
public class usoTallas {
	
	enum Talla{S,M,L,XL};
	
	enum Talla2{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),EXTRA("XL");
		
		private Talla2(String abreviatura) { //No se permite instanciación pues no se permite invocar al constructor.
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
	};
	
	
	public static void main (String[]args) {
		//Tipos enumerados: variable objeto de tipo enum donde se puede restringir el 
		// almacenamiento de valores a un grupo específico
	
		String talla;
		talla = "S";
		talla = "M";
		talla = "L";
		
		Talla s = Talla.S;
		Talla m = Talla.M;
		Talla l = Talla.L;
		//Talla xl = Talla.e; //al no estar contemplado en el tipo enum, muestra mensaje de error.
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, EXTRA");
		
		Scanner sc = new Scanner(System.in);		
		String intDatos = sc.next().toUpperCase();
		sc.close();
		
		Talla2 laTalla = Enum.valueOf(Talla2.class, intDatos);
		
		System.out.println("La talla es: " + laTalla);
		System.out.println("Abreviatura: " + laTalla.getAbreviatura());
		
	}
}
