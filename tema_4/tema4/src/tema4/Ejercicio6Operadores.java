package tema4;

public class Ejercicio6Operadores {
	
public static void main(String[] args) {
	
	int n1=3;
	int n2=4;
	
	int result=0;
	System.out.println("El primero es: "+ n1);
	System.out.println("El segundo es: "+ n2);
//	if(n1>n2) {
		
	//	result=n1+n2;
	//	System.out.println("La suma es: "+ result);
		
	//} else if(n2>n1) {
		
	//	result=n2-n1;
	//	System.out.println("La resta es: "+ result);
		result= (n1>n2)?(n1+n2):(n2-n1);
		System.out.println("El resultado es: "+ result);
		
	}
	
}
