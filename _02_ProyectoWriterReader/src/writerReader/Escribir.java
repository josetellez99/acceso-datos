package writerReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Escribir 
{	public static Writer escribir = null;

	public static String texto = "En un lugar de La Mancha";

	public static void setEscribir()
	{	try 
		{	escribir = new FileWriter("a.txt");
			//Writer objeto = new FileWriter(archivo);
		} catch (IOException e) 
		{	e.printStackTrace();
		}
	}

	public static void enviar()
	{	try 
		{	escribir.write(texto);//Escribe todo
			escribir.flush();
			//Añadir flush para que el proceso de escritura no se quede
			// a medias
		} catch (IOException e) 
		{	e.printStackTrace();
		}
	}
	
	public static void cerrar()
	{	try 
		{	escribir.close();
		} catch (IOException e) 
		{	e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{	setEscribir();
		enviar();
		cerrar();
	}
}
