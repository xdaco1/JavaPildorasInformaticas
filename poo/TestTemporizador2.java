/*
// Clases internas (uso)
// Acceder a los campos privados de una clase desde otra.
// Ocultar la clase interna de otras pertenecientes al mismo paquete (encapsulamiento de la clase).
// Crear clases internas anónimas. Muy útil para gestionar eventos y retrollamadas.
// Cuando sólo una clase debe acceder a los campos de ejemplar de otra.
 */
package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class TestTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj miReloj=new Reloj(3000,true);
		miReloj.initReloj();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		System.exit(0);
	}

}

class Reloj {
	
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	private class CurTime2 implements ActionListener{ //private sólo para clase interna no para otras
		
		public void actionPerformed(ActionEvent evento) {
			
			Date curDate=new Date();
			System.out.println("Hora mostrada con periodicidad" + curDate);
			
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
	}
	
	public void initReloj() {
		ActionListener oyente=new CurTime2();
		Timer miTemp = new Timer(intervalo,oyente);
		miTemp.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
}