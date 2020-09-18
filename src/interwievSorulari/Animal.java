package interwievSorulari;

public class Animal {
	String color = "White";
	int legs;
	
	void eat(){
		System.out.println("Animal is eating.");
	}
	public Animal(){
		System.out.println("Animal is created");
	}
	
}

class Dog extends Animal{
	String color = "Black";
	
	public Dog(){
//		super();
		System.out.println("Dog is created");
		
	}
	
	void eat(){
//		super.eat(); 
		System.out.println("Dog is eating dogfood"); 
		
	}
	
	
	
	void printColor(){
		System.out.println( color); // Prints color of Dog Class
		System.out.println(super.color); // Prints color of Animal Class
	}
	
	
}