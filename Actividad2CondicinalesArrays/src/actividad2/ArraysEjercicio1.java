package actividad2;

import java.util.Scanner;
/**
 * 
 * @author Sara Jordana
 *
 */

public class ArraysEjercicio1 {

public static void main(String[]args) {
int media = 0;
Scanner sc = new Scanner (System.in);

int [] numeros= new int[5] ;

for(int i=0;i<numeros.length;i++) {
	
		System.out.println("Por favor introduce un número");
		numeros[i]= sc.nextInt();
		media= media+numeros[i];	
		media=media/numeros.length;
	
}

System.out.println("La media es: "+media);
	
	
}	
}
