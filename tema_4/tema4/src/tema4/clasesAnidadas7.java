package tema4;
//las enumeraciones van siempre arriba de la clase siempre que vayan juntos
enum Color{
	
	ROJO,VERDE,AZUL;
}
public class clasesAnidadas7 {
	
public static void main(String[]args) {
	
	//llamado a values()
	
	
	String car= "fiat";
	String cars[]= {"volvo","fiat","Renault"};
	
	//System.out.println(cars[0]);
	
	for(int i=0;i<3;i++) {
		System.out.println(cars[i]);
			
	}
	System.out.println("Tamaño Array: "+cars.length);
	
	for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i]);
			
	}
	
	for (String i: cars) {
		System.out.println(i);
	}
}
	
	
}
