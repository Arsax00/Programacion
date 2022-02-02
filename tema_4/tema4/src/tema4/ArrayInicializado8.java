package tema4;

public class ArrayInicializado8 {

	public static void main(String[]args) {
		
		String[] provincia= {"huelva","cadiz","malaga","almeria","cordoba","granada"};
		int[] numero= {23,46,520,8,20,530};
		
		for(int i=0;i<=5;i++) {
			
			//System.out.println(numero[i]);
			

			if(numero[i] >= 500) {
				
				System.out.println("ALERTACOVID");
				
				System.out.println(provincia[i]);
			}	
		}
		 
	//	for(int elemento:numero)
			
		//	 System.out.println(elemento);
	
}
}
