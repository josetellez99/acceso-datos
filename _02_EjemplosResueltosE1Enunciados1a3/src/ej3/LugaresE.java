package ej3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LugaresE {

	/*3.Empleando FileOutputSteam, escribir a lugares.xls 
cuatro lugares  a tu elección, no los indicados en la imagen ejemplo. 
LugaresE.java escribe. */
	
	public static FileOutputStream fos = null;
	public static String enviar ="Lugar\tPaís\n"
							    +"Acueducto\tEspaña\n"
							    +"Coliseo\tItalia\n"
							    +"Guiza\tEgipto\n"
							    +"Chichén Itzá\tMéxico";
		
	public static void setFos()
	{	try 
		{	fos = new FileOutputStream("lugares.xls");
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
	
	public static void main(String[] args) 
	{	//Escribir
		setFos();
		enviar();
		cerrarFlujoSalida();	
	}
}
