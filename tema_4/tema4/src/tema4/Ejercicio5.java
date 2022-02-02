package tema4;

import java.util.Scanner;
import tema4.DiasSemana.DiasSem;
public class Ejercicio5 {

	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un día de la semana" );
		String dia= sc.next();
		
		System.out.println("Día Introducido: "+dia);
		
		DiasSem dias = DiasSem.valueOf(dia.toUpperCase());
		
		switch(dias) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("El dia "+dias.name().toLowerCase()+" es laborable");
			break;
		
		}
		
	}
}
