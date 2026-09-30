package compararString;

public class CompararString 
{	private static boolean iguales = false;
	private static String st [] = {"Tardígrado","Tardígrado","Mixino"};
	
	public static void setIguales(String s1, String s2)
	{	if (s1.equals(s2)==true)//No poner s1==s2
			iguales = true;
		else
			iguales = false;
	}
	
	public static String getSt(byte b)
	{	return st[b];		
	}
	
	public static boolean getIguales()
	{	return iguales;		
	}
	
	public static void show()
	{	System.out.print("Cadenas de caracteres ");
		if (getIguales()==true)
			System.out.println("iguales");
		else
			System.out.println("diferentes");
	}
	
	public static void main(String[] args) 
	{	setIguales(st[0], st[1]);
		show();
		setIguales(st[0], st[2]);
		show();
	}
}
