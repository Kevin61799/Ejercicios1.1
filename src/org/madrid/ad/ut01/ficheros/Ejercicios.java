package org.madrid.ad.ut01.ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date 
 * @version 
 * @license GPLv3
 *
 */
public class Ejercicios implements InterfazEjercicios {

	@Override
	public String[] listarDirectorio(String directorio) {
		System.out.println("Ficheros en el directorio actual:");
		String RUTA_DIRECTORIO = directorio;
		String[] contenido = new File(RUTA_DIRECTORIO).list();
		Arrays.sort(contenido);
		for (String archivo : contenido) {
			System.out.println(archivo);
		}
		return null;
	}

	@Override
	public void crearFicherosIO() {
		
		
		//Creamos el directorio
		
		/*
		File directorio = new File ("NUEVODIR");
		directorio.mkdir();
		*/
		
		
		//Creamos dos ficheros dentro del nuevo directorio
		
		/*
		File archivo1 = new File ("NUEVODIR\\FICHERO1.txt");
		File archivo2 = new File ("NUEVODIR\\FICHERO2.txt");
		try {
			archivo1.createNewFile();
			archivo2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		//Renombrar fichero
		
		/*
		File archivo1 = new File ("NUEVODIR\\FICHERO1.txt");
		File archivo2 = new File ("NUEVODIR\\FICHERO1NUEVO.txt");
		archivo1.renameTo(archivo2);
		*/
		
		
		//Creamos otro fichero en el directorio NUEVODIR
		
		/*
		File archivo3 = new File ("NUEVODIR\\FICHERO3.txt");
		try {
			archivo3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		//Eliminamos el fichero FICHERO2.TXT
		
		/*
		File archivo2 = new File ("NUEVODIR\\FICHERO2.txt");
		archivo2.delete();
		*/
	}

	@Override
	public void crearFicherosNIO() {
		
		//Creamos un directorio
		
		/*
		Path directorio = Paths.get("NUEVODIR");
		try {
			Files.createDirectories(directorio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		//Creamos dos ficheros dentro de NUEVODIR
		
		/*
		Path archivo1 = Paths.get("NUEVODIR\\FICHERO1.txt");
		Path archivo2 = Paths.get("NUEVODIR\\FICHERO2.txt");
		try {
			Files.createFile(archivo1);
			Files.createFile(archivo2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		//Renombrar fichero
		
		/*
		Path archivo1 = Paths.get("NUEVODIR\\FICHERO1.txt");
		try {
			Files.move(archivo1, archivo1.resolveSibling("FICHERO1NUEVO.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		//Creamos otro fichero en el directorio NUEVODIR
		
		/*
		Path archivo3 = Paths.get("NUEVODIR\\FICHERO3.txt");
		try {
			Files.createFile(archivo3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		//Eliminamos el fichero FICHERO2.TXT
		
		/*
		Path archivo2 = Paths.get("NUEVODIR\\FICHERO2.txt");
		try {
			Files.delete(archivo2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
	}

	@Override
	public void infoFicheroIO(String fichero) {
		
		System.out.println("Informacion del fichero: ");
		
		File info = new File(fichero);
		
		if(info.exists()) {
			System.out.println("Nombre del fichero: " + info.getName());
			System.out.println("Ruta: " + info.getPath());
			System.out.println("Ruta absoluta: " + info.getAbsolutePath());
			System.out.println("Se puede leer: " + info.canRead());
			System.out.println("Se puede escribir: " + info.canWrite());
			System.out.println("Tamaño: " + info.length());
			System.out.println("Es un directorio: " + info.isDirectory());
			System.out.println("Es un fichero: " + info.isFile());
		}
		
	}

	@Override
	public void infoFicheroNIO(String fichero) {
		
		Path info = Paths.get(fichero);
		
		System.out.println("Informacion del fichero: " + info.toString());
		System.out.println("" + info.getFileName());
		System.out.println("" + info.getName(0));
		System.out.println("" + info.getNameCount());
		System.out.println("" + info.subpath(0, 2));
		System.out.println("" + info.getParent());
		System.out.println("" + info.getRoot());
		
		
	}

}
