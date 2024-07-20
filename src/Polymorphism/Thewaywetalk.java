package Polymorphism;

public class Thewaywetalk {

	
	
	public void talk(Parents styleoftalking) {
		System.out.println("Polite, Respectful");
		
	}
	

	public void talk(Partner styleoftalking) {
		System.out.println("Love and Romantic");
		
	}
	
public void talk(Boss styleoftalking) {
		
	System.out.println("Nothing personal");
	}
	public static void main(String[] args) {
		  Thewaywetalk talk= new Thewaywetalk();
		
		  Parents parents = new Parents();
		  talk.talk(parents);
		  
		  Boss boss = new Boss();
		  talk.talk(boss);
		  
		  Partner partner = new Partner();
		  talk.talk(partner);
		  
	}

}
