package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero,climatizador;
	
	
	public Coche() {
		ruedas	=	4;
		largo 	= 	2000;
		ancho 	=	300;
		motor	=	1600;
		pesoPlataforma	=	500;
	}
	
	public String dimeLargo() { //getter
		return "El largo del coche es " + largo;
	}
	
	public void estableceColor(String  colorCoche) { //setter
		color = colorCoche;
	}
	
	public String dimeColor() {
		return "El color del coche es " + color;
	}
	
	public void tieneAsientosCuero(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero=true;
		} else {
			this.asientosCuero=false;
		}
	}
	
	public String dimeAsientos() {
		if (asientosCuero) {
			return "el coche tiene asientos de cuero";
		} else {
			return "el coche tiene asientos de serie";
		}
	}
	
	public String dimePesoCoche() { //setter + getter no recomendado
		
		int pesoCarroceria=500;
		
		pesoTotal=pesoCarroceria+pesoPlataforma;
		
		if(asientosCuero) {
			pesoTotal+=50;
		}
		if(climatizador) {
			pesoTotal+=20;
		}
		
		return "El peso del coche es " + pesoTotal;
	}
}