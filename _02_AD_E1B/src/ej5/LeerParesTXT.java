package ej5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerParesTXT {

	public static FileReader fr = null;
	public static String recibir ="";

	public static void setFr() {
		try {
			fr = new FileReader("Escrito.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void recibir() {
		byte posicion = 0;
		int i;
		try {
			while ((i = fr.read()) != -1) {
				char c = (char)i;
				if (posicion == 0)
					recibir += c+"\n";
				posicion++;
				if (c == '\n')
					posicion = 0;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void show() {
		System.out.println("Contenido del archivo externo:\n"+recibir);
	}

	public static void cerrarFlujoEntrada() {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//Leer
		setFr();
		recibir();
		show();
		cerrarFlujoEntrada();
	}
}
