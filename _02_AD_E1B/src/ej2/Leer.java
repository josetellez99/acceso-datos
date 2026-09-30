package ej2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Leer {

	/*2.Empleando FileInputStream, se lee el contenido del 
archivo externo y se muestra por consola. Leer.java lee.  */
	
	public static FileInputStream fis = null;
	public static String recibir ="";
		
	public static void setFis()
	{	try 
		{	fis = new FileInputStream("apellidos.txt");
		} 
		catch (FileNotFoundException e) 
		{	e.printStackTrace();
		}
	}
	
	public static void recibir()
	{	short cont=0;
		try 
		{	while (fis.read()!=-1)
				cont++;
		} catch (IOException e) 
		{	e.printStackTrace();
		}
		
		cerrarFlujoEntrada();
		setFis();
		
		for (short s=0; s<cont; s++)
		{	try 
			{	char c = (char)(fis.read());
				recibir += c;
			} catch (IOException e) 
			{	e.printStackTrace();
			}
		}
	}
	
	public static void show()
	{	System.out.println("Contenido del archivo externo:\n"+recibir);
	}
	
	public static void cerrarFlujoEntrada()
	{	try 
		{	fis.close();
		} catch (IOException e) 
		{	e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{	//Leer, no conocemos el número de caracteres de apellidos.txt
		setFis();
		recibir();
		show();
		cerrarFlujoEntrada();
	}
}
