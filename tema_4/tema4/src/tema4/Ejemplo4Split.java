package tema4;

import java.util.StringTokenizer;

public class Ejemplo4Split {

	public static void main(String[]args) {
		
		String str1 = new String(" Kansas, New York, Mississipi, Louisiana, New Jersey");
		String str2= new String("1,2,3,4,5");
		
		String delimSpace=",";
		
		//2 params Constructor => StringTokenizer
		
		StringTokenizer stObj = new StringTokenizer(str1,delimSpace);
		StringTokenizer st2Obj = new StringTokenizer(str2,delimSpace);
		while(stObj.hasMoreElements()) {
			
			System.out.println("StringTokenizer Output "+ st2Obj.nextElement()+ ": " +stObj.nextElement());
		}
		
	}
	
}
