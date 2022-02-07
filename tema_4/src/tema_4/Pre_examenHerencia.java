package tema_4;

public class Pre_examenHerencia {

	
	
}
abstract class LivingT {
	
	String name;
	

	LivingT(){
	
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
	
	public void walk() {
		
		System.out.println("Está caminando...");
	}
	
}

