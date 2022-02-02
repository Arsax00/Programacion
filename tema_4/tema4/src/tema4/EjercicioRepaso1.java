package tema4;

import java.text.NumberFormat;
import java.util.Locale;

public class EjercicioRepaso1 {
	
	public static void main (String[] args) {
	
	Locale locale= new Locale("en","uk");
		NumberFormat objNF=NumberFormat.getInstance(locale);
		String cadena= objNF.format(999999.99);
		
		System.out.println("INGLATERRA");
		System.out.print("--------------");
		System.out.println(cadena);
		
	}
	}


