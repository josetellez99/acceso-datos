package Externo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
	
	public static FileOutputStream flujoE = null;
	public static String contenido = "Contenido DAM2";
	public static void setFileOutputStream() {
			try {
				flujoE = new FileOutputStream("a.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void send() {
		for(short c = 0; c < contenido.length(); c++) {
			byte b = (byte)(contenido.charAt(c));
			try {
				flujoE.write(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close() {
		try {
			flujoE.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		setFileOutputStream();
		send();
	}

}
