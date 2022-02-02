package tema4;

import java.text.NumberFormat;
import java.util.Locale;

public class EjercicioRepaso2 {
public static void main(String[] args) {
		
		//Localidad Inglaterra:
			Locale locale=new Locale ("en", "UK");
			NumberFormat objNF=NumberFormat.getInstance(locale);
			String cadena=objNF.format(999999.99);
	
			System.out.println(" Inglaterra/England ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			System.out.println(cadena);
		
		//Localidad España:
			Locale locale2=new Locale ("es", "ES");
			NumberFormat objNF2=NumberFormat.getInstance(locale2);
			String cadena2=objNF2.format(999999.99);
	
			System.out.println();
			System.out.println(" España/Spain ");
			System.out.println("~~~~~~~~~~~~~~");
			System.out.println(cadena2);
	}

}
