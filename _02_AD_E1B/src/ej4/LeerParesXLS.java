package ej4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerParesXLS {

	public static FileReader fr = null;
	public static String recibir ="";

	public static void setFr() {
		try {
			fr = new FileReader("Escrito.xls");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void recibir() {

		byte numFila = 0;
		int i;
		
		try {
			while ((i = fr.read()) != -1) {
				char c = (char)i;
				if ((numFila%2)==0)
					recibir += c;
				if (c == '\n')
					numFila++;
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
