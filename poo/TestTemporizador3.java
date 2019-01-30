/*
// Clases internas locales (uso)
// Son clases dentro de un método.
// Se utilizan sólo si la clase es instanciada una única vez y puede hacerse dentro del método.
// Simplifica  el código resultante.
 */
package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class TestTemporizador3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj2 miReloj=new Reloj2();
		miReloj.initReloj(3000,true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		System.exit(0);
	}

}

class Reloj2 {
	
	//al usar clases internas locales y mover las variables de clase allí, se puede suprimir tales variables y el contructor
	//private int intervalo; //la clase interna local puede acceder a las variables de clase o a las del método.
	//private boolean sonido;//la clase interna local puede acceder a las variables de clase o a las del método.
	
//	public Reloj2(int intervalo, boolean sonido) {
//		this.intervalo = intervalo;
//		this.sonido = sonido;
//	}
	
	public void initReloj(int intervalo, boolean sonido) {
		
		
		
		class CurTime2 implements ActionListener{ //clase interna local. Se utiliza unicamente cuando la clase se instancia una unica vez. y no debe llevar modificadores de acceso.
			
			public void actionPerformed(ActionEvent evento) {
				
				Date curDate=new Date();
				System.out.println("Hora mostrada con periodicidad" + curDate);
				
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		}
		
		ActionListener oyente=new CurTime2();
		Timer miTemp = new Timer(intervalo,oyente);
		miTemp.start();
	}
	
}