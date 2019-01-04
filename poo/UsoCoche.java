package poo;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault	=	new Coche(); //Instanciación de clase. Ejemplar de clase.
		Coche miCoche	=	new Coche();
		
		//System.out.println(Renault.dimeLargo());
		
		miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(miCoche.dimeColor());
		
		miCoche.tieneAsientosCuero("SI");
		System.out.println(miCoche.dimeAsientos());

	}

}
