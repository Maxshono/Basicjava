package Constructors;

public class Animal {

	
	
	String Animal_name;
	String Animal_type;
	
	public Animal(String name, String type) {
		
	Animal_name=name;
	Animal_type=type;
	}
	
	
	public void sayabutanimal() {
		System.out.println("Animal name is "+Animal_name+"Animal type is "+Animal_type);
	}
	public static void main(String[] args) {
		 Animal animal = new Animal("Lion", "Omnivores");
		 animal.sayabutanimal();
		 Animal animal1 = new Animal("Tiger", "Omnivores");
		 animal1.sayabutanimal();

	}

}
