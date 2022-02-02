package tema4;

import java.text.SimpleDateFormat;

public class EjercicioRepaso3 {
public static void main(String[] args) throws Exception{
		
		String Fecha="28/01/2022";
		System.out.println("La fecha es: "+Fecha);
		
		SimpleDateFormat fechaNueva=new SimpleDateFormat("dd/MM/yyyy");
		
		java.util.Date fechaObj=fechaNueva.parse(Fecha);
		
		System.out.println(fechaObj);
		
		
	}

}
