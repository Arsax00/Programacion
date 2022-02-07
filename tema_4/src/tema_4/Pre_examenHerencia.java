package tema_4;

public class Pre_examenHerencia {

	
	
}
abstract class LivingT {
	
	String name;
	

	public LivingT( ){
	
	name= "Josh";
	}
	
	public void respirar() {
		
		System.out.println("Está respirando...");
		
	}
	public void comer() {
		
		
		System.out.println("Está comiendo...");
		
	}
	
	abstract public void walk();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Human extends LivingT{
	
	public Human(String name) {
		name="James";
	}

	public void walk() {
		
		System.out.println("Está caminando...");
	}
		
}
 class Monkey extends LivingT{
	 
	 public Monkey(String name) {
			name="monkey";
		}

	 public void walk() {
			
			System.out.println("Está caminando mucho...");
		}
	
	 
	 
}
	
