package tema4;

import java.util.Scanner;

public class arrayInicializado9 {

	
	public static void main(String[]args) {
		
		int[]numeros=new int[4];
		Scanner teclado=new Scanner(System.in);
		for(int i=0; i<numeros.length; i++) {
			
			System.out.printf("Introduzca número %d: ",i+1);
			numeros[i]= teclado.nextInt();
			
		}
		int suma = 0;
		for (int i=0; i<numeros.length;i++) {
			suma += numeros[i];
			System.out.println(numeros[i]);
		}
		
		System.out.println("La media es: "+suma/numeros.length);
	}
}
