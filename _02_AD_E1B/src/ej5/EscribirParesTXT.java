package ej5;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirParesTXT {

	/*5.Empleando Writer, se crea Escrito.txt con parejas de números enteros
positivos aleatorios de una cifra, separados por un espacio, en el primer y
tercer caracter de las cinco primeras líneas. */

	public static FileWriter fw = null;

	public static void setFw() {
		try {
			fw = new FileWriter("Escrito.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void enviar() {
		try {
			for (byte linea=0; linea<5; linea++) {
				int a = (int)(Math.random()*9)+1;//Positivo de una cifra: 1-9
				int b = (int)(Math.random()*9)+1;
				fw.write(a+" "+b+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void cerrarFlujoSalida() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//Escribir
		setFw();
		enviar();
		cerrarFlujoSalida();
	}
}
