package actividad2;
/**
 * 
 * @author Sara Jordana
 *
 */
public class CondicionalEjercicio4 {
	public static void main (String []args) {
	
	int C=-80;
	
	String R= (C<0)?"es negativo":"es positivo";
	
	String R2= (C%2==0)?"es par":"es impar";
	
	String R3=(C%5==0)?"es múltiplo de 5":"no es múltiplo de 5";
	
	String R4=(C%10==0)?"es múltiplo de 10":"no es múltiplo de 10";
	
	String R5=(C>=100)?"es mayor o igual a 100":"es menor que 100";
	
	System.out.println(C+" "+R+ ", "+R2+ ", "+R3+ ", "+R4+", "+R5);
}
}