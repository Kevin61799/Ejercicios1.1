package org.madrid.ad.ut01.ficheros;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
			Ejercicios c = new Ejercicios();
			
//			c.crearFicherosIO();
//			c.crearFicherosNIO();
			
			
			Scanner introducirRuta = new Scanner(System.in);
			System.out.println("Introduce la ruta: ");
			String ruta = introducirRuta.next();
//			c.listarDirectorio(ruta);
//			c.infoFicheroIO(ruta);
//			c.infoFicheroNIO(ruta);
			
			InterfazEjercicios.pruebasRutas01(ruta);
		}
}
