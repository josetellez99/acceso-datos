package writerReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Leer 
{	public static Reader leer = null;

	public static String contenido = "";

	public static void setLeer()
	{	try 
		{	leer = new FileReader("a.txt");
		//Reader objeto = new FileReader(archivo);
		} catch (FileNotFoundException e) 
		{	e.printStackTrace();
		}
	}
	
	public static void recibir ()
	{	//1.Se cuenta el número de caracteres en el archivo
		short cont = 0;
		try 
		{	while (leer.read()!=-1)
			{	cont++;				
			}
		} catch (IOException e) 
		{	e.printStackTrace();
		}
		
		//2.Se cierra el flujo al archivo
		cerrar();
		
		//3.Se reinicia el flujo
		setLeer();
		
		//4.Se va recogiendo cada caracter y se agrega al String
		for (short s=0;s<cont;s++)
		{	try 
			{	char ch = (char)(leer.read());
				contenido += ch;
			} catch (IOException e) 
			{	e.printStackTrace();
			}
		}
	}
	
	public static void show()
	{	System.out.println("Contenido: "+contenido);
	}

	public static void cerrar()
	{	try 
		{	leer.close();
		} catch (IOException e) 
		{	e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{	setLeer();
		recibir();
		show();
		cerrar();
	}
}
