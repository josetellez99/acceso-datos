package ej1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Flujo {

	/*1.Empleando FileOutputSteam y FileInputStream, escribir a 
	 * nombres.txt cinco nombres a tu elección. El primero, el tuyo. 
	 * Después, se lee el contenido del archivo externo y se muestra por 
	 * consola. Todo dentro de Flujo.java. */
	
	public static FileOutputStream fos = null;
	public static FileInputStream fis = null;
	public static String enviar ="Rodrigo\tBea\nSandra\tAndrés\nNatalia";
	public static String recibir ="";
	
	public static void setFos()
	{	try 
		{	fos = new FileOutputStream("nombres.txt");
		} 
		catch (FileNotFoundException e) 
		{	e.printStackTrace();
		}
	}
	
	public static void enviar()
	{	short nChar=0; 
	  	char car='a'; 
	  	try 
	  	{ 	for (nChar=0;nChar<enviar.length();nChar++) 
	  		{ 	car = enviar.charAt(nChar); 
	  			fos.write((byte)car); 
	  		} 
	  	} 
	  catch(IOException e) 
	  { e.printStackTrace(); 
	  }
	}

	public static void cerrarFlujoSalida()
	{	try 
		{	fos.close();
		} catch (IOException e) 
		{	e.printStackTrace();
		}
	}

	public static void setFis()
	{	try 
		{	fis = new FileInputStream("nombres.txt");
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
	{	//Escribir
		setFos();
		enviar();
		cerrarFlujoSalida();
		
		//Leer, no conocemos el número de caracteres de nombres.txt
		setFis();
		recibir();
		show();
		cerrarFlujoEntrada();
	}
}
