package ej4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirParesXLS {

	public static FileWriter fw = null;
	public static Scanner sc = new Scanner(System.in);

	public static void setFw() {
		try {
			fw = new FileWriter("Escrito.xls");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void enviar() {
		char resp = 'S';
		try {
			while (resp == 'S') {
				int a = (int)(Math.random() * 90) + 10;
				int b = (int)(Math.random()* 90) + 10;
				fw.write(a+"\t"+b+"\n");

				do {
					System.out.println("¿Escribir otra línea? (S/N)");
					resp = sc.nextLine().toUpperCase().charAt(0);
				} while (resp != 'S' && resp != 'N');
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
