package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.Toolkit;

public class TestTemporizador {

	public static void main(String[] args) {
		
		ActionListener oyente = new CurTime(); //Se crea una instancia del tipo de la interfaz pero de un tipo que la implementa.
		
		Timer miTemporizador = new Timer(5000, oyente);
		
		miTemporizador.start();//En este punto, la ejecución se va a detener. Se debe identifica la manera de prolongar esta ejecución.
		
		//JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.exit(0);

	}

}

class CurTime implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		Date curDate = new Date();

		System.out.println("Hora cada 5 segundos " + curDate);
		Toolkit.getDefaultToolkit().beep();
		
		
	}
	
}