package poo;

public class Furgoneta extends Coche{
	
	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta(int capacidadCarga, int plazasExtra) {
		
		super(); //Llama al constructor de la s�per clase (clase padre)
		
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra 	= plazasExtra;
		
	}
	
}
