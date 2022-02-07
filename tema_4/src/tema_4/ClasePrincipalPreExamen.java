package tema_4;

public class ClasePrincipalPreExamen {
	
	public static void main (String[]args){
		
		
		Human human1= new Human("Josh");	
		
		human1.walk();
		
		LivingT livingthing1=human1;
		livingthing1.walk();
		
		LivingT livingthing2= new Monkey("MonkeyWrench");
		livingthing2.walk();
		
		
		System.out.println("human1.getName() = " + human1.getName());
		System.out.println("livingthing1.getName() = " + livingthing1.getName());
		
		boolean b1 = (human1 == livingthing1);
		System.out.println("Do human1 and livingthing1 point to the same object instance? " + b1);
		
		//LivingT z = new LivingT(); 
		
	}
	
	
	 
}
