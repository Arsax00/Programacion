package tema4;

//Delimitadores oara crear arrays
public class SplitOwn10 {

	public static void main (String []args) {
	//Sample1
	String str1= new String("Hola, que tal? warra");
	String delimSpace="[,.?!]";
	
	String[] arr1 = str1.split(delimSpace);
	String str2= new String("MIRA MI HUEVO!ESTO TE VA A FASCINAR. Aquí llega un champiñón.");
	String[]arr2= str2.split(delimSpace);
	

	for(String  uniqVal1 : arr1  ) {
		
	System.out.println(uniqVal1);

	}
      for(String uniqVal2 : arr2 ) {
		
		System.out.println(uniqVal2);
	}
	
	}		
}
