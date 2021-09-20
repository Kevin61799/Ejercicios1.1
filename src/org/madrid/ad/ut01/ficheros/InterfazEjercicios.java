package org.madrid.ad.ut01.ficheros;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date 
 * @version 
 * @license GPLv3
 *
 */
public interface InterfazEjercicios {

	/**
	 * 
	 * @param directorio
	 * @return contenido de la ruta recibido
	 */
	public String[] listarDirectorio(String directorio);

	/**
	 * crea un directorio llamado NUEVODIR en el directorio actual a continuaci�n
	 * que cree dos ficheros vac�os llamados FICHERO1.TXT y FICHERO2.TXT. Se
	 * renombrar� el FICHERO1.TXT por FICHERO1NUEVO. Se crear� un nuevo fichero
	 * dentro de NUEVODIR llamado FICHERO3.TXT. Por �ltimo, se borrar� el fichero
	 * FICHERO2.TXT
	 * 
	 */
	public void crearFicherosIO();

	/**
	 * realice la misma funci�n que el m�todo listarDirectorio pero utilizando las
	 * clases Path y Files de java.nio.
	 */
	public void crearFicherosNIO();

	/**
	 * imprima en la consola toda informaci�n sobre un fichero recibido por un
	 * par�metro de tipo String con la clase java.io.File.
	 * 
	 * @param fichero
	 */
	public void infoFicheroIO(String fichero);

	/**
	 * imprima en la consola toda informaci�n sobre un fichero recibido por un
	 * par�metro de tipo String utilizando las clases Path y Files de java.nio
	 * 
	 * @param fichero
	 */
	public void infoFicheroNIO(String fichero);

	/**
	 * 
	 * @param fichero
	 */
	static void pruebasRutas01(String fichero) {
		Path path = Paths.get(fichero);

		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
	}

	static void pruebasRutas02(String fichero) {

	}

	/*
	 * Para ejecutar Bot�n derecho --> Run as --> Run Configurations --> En
	 * argumentos escribir entrada.txt. Es necesario para probar toAbsolutePath
	 */
	public static void pruebasRutas03(String[] args) {

		// Primer m�todo toUri
		Path p1 = Paths.get("entrada.txt");

		System.out.format("%s%n", "URI " + p1.toUri());

		// -------------------------------------------------------------------------------

		// Segundo m�todo toAbsolutePath

		if (args.length < 1) {
			System.out.println("debes pasar un nombre de archivo como argumento");
			System.exit(-1);
		}

		Path inputPath = Paths.get(args[0]);
		Path fullPath = inputPath.toAbsolutePath();

		System.out.println("Path absoluto " + fullPath);

		// -------------------------------------------------------------------------------

		// Tercer m�todo toRealPath

		Path p2 = Paths.get("./entrada.txt");
		try {

			Path fp = p2.toRealPath();

			System.out.println("Path real " + fp);
		} catch (NoSuchFileException x) {

			System.err.format("%s: no existe" + " el fichero o directorio %n", p2);

		} catch (IOException x) {

			System.err.format("%s%n", x);

		}

	}

	public static void pruebasRutas04() {

		Path p0 = Paths.get("C:\\Usuarios\\pepe\\fotos");

		System.out.format("%s%n", p0.resolve("docs"));

		Path p1 = Paths.get("fotos");

		System.out.format("%s%n", p1.resolve("C:\\Usuarios\\pepe"));
		// ------------------------------------------------------------------

		Path p2 = Paths.get("pepe");
		Path p3 = Paths.get("juan");

		Path p2_to_p3 = p2.relativize(p3);
		System.out.format("%s%n", p2_to_p3);

		Path p3_to_p2 = p3.relativize(p2);
		System.out.format("%s%n", p3_to_p2);

		Path p4 = Paths.get("Usuarios");
		Path p5 = Paths.get("Usuarios\\juan\\docs");

		Path p4_to_p5 = p4.relativize(p5);
		System.out.format("%s%n", p4_to_p5);

		Path p5_to_p4 = p5.relativize(p4);
		System.out.format("%s%n", p5_to_p4);

	}

	public static void pruebasRutas05(String ruta1, String ruta2) {

	}

	public static void pruebasRutas05(String ruta1, String ruta2, String comienzo) {

	}

	public static void pruebasRutas05(String ruta1, String ruta2, String comienzo, String fin) {

	}

}
