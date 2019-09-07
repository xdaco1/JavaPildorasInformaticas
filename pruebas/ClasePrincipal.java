package pruebas;

public class ClasePrincipal {

	public static void main(String[] args) {
			
		//Medio usb = new Medio();
		//usb.setCapacidadGb(128);
		//System.out.println(usb.getCapacidadGb());
		
		Flash usb = new Flash();
		usb.setCapacidadGb(8);
		System.out.println(usb.getCapacidadTxt());
		
	}

}

abstract class Medio{
	private int capacidadGb;
	
	public Medio() {
		capacidadGb = 15;
	}
	
	public int getCapacidadGb() {
		return capacidadGb;
	}
	
	public void setCapacidadGb(int capacidadGb) {
		this.capacidadGb = capacidadGb;
	}
	
	public abstract String getCapacidadTxt();
	
}

class Flash extends Medio{
	
	public Flash() {
		super();
	}
	
	public String getCapacidadTxt() {
		return "La usb soporta " + getCapacidadGb() + " GB ";
	}
	
}