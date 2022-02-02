package tema4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class delimitador11 {


	public static void main(String[]args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Pon nombre y apellidos");
		
		String a = sc.nextLine();
		
		String delimSpace=" ";
		
		String[ ]data =a.split(delimSpace);
		for(String valores: data) {
			
			System.out.println(valores);
		}
		
		
		
	}
	
}
