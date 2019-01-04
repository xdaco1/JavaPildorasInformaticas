package poo;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche1 = new Coche();
		miCoche1.estableceColor("azul");
		
		Furgoneta miFurgoneta1 = new Furgoneta(100, 4);
		miFurgoneta1.estableceColor("Blanco");
		
		System.out.println(miCoche1.dimeColor());
		System.out.println(miFurgoneta1.dimeColor());
		 
		
	}

}
