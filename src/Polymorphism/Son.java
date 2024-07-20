package Polymorphism;

public class Son extends  Parents{

	@Override
	public void marriage() {
		System.out.println("my marriage my rules");
	}	
	
	public static void main(String[] args) {
		
		Parents parents = new Son();
		parents.property();
		parents.marriage();

	}

}
