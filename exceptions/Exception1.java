package exceptions;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Exception1 {
	
	static final String fileName = "E:\\Laboral\\CMC\\Formacion\\Java\\CursoPildorasInformaticas\\src\\AccesoAplicacion.java";

	public static void main(String[] args) {
		
		//File imagen = new File(fileName);
		
		try {
			
			BufferedImage imagen = ImageIO.read(new File("E:\\Laboral\\CMC\\Formacion\\Java\\CursoPildorasInformaticas\\src\\AccesoAplicacion.jav"));
			
		} catch (IOException e) {
			System.out.println("archivo no existe: " + e);
		}

	}

}