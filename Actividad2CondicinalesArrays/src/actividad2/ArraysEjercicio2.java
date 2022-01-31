package actividad2;

import java.util.Scanner;

/**
 * 
 * @author Sara Jordana
 *
 */
public class ArraysEjercicio2 {

	public static void main( String []args) {
		 double media=0.0;
		 int contador = 0;
	Scanner sc = new Scanner (System.in);
	int [] numbers = new int [10];
	
	System.out.println("Escribe 10 numeros: ");
	
	for (int i=0; i<numbers.length;i++) {
		
		numbers[i]=sc.nextInt();
		
	
	if (numbers[i]%2==0) {
		System.out.println("es par");
	   media= media+numbers[i];
	   contador++;
	   
	}
	else
		System.out.println("es impar");
	}
	media = media/contador;
	System.out.println("La media es: "+ media);
	
	
	}	
}