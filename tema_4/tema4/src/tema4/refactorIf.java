package tema4;

public class refactorIf {
	
public	static int val1= 5;
public static int val2= 7;
public 	static int result= 0;
	
	public static void main (String []args) {
	
	if(val2>=val1) {
		
		result=val2;
	}
	else {
		result=val1;
	}
	result=(val2 >= val1) ? val2:val1;
	System.out.println("valor final: "+result);
	
	

}
}
