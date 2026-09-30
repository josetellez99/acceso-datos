package ej3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LugaresL {

	/*3.Empleando FileInputStream, se lee 
el contenido del archivo externo y se muestra por consola.  
LugaresL.java lee las filas 1, 3 y 5 del excel. */
	
	public static FileInputStream fis = null;
	public static String recibir ="";
		
	public static void setFis()
	{	try 
		{	fis = new FileInputStream("lugares.xls");
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
		
		byte numFila = 1;//Iniciamos contador número de fila con 1
		for (short s=0; s<cont; s++)
		{	try 
			{	char c = (char)(fis.read());
				if (((numFila)%2)==1)//Si el número de fila es impar
				//if ((numFila==1)||(numFila==3)||(numFila==5))
					recibir += c;
				if (c == '\n')//Si el caracter es un cambio de línea
					numFila++;//Pasamos a la siguiente fila
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
