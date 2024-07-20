package ConditionalStatement;

public class Whoisthehero {

	String heroname="Max";
	
	
	public void Superheroorguesser() {
		if (heroname.equals("Max")) {
			System.out.println("Max is a Superhero");
			
		} 
		else if (heroname.equals("Poonam")) {
			
			System.out.println("Poonam is a Superhero");
			
		}else if  (heroname.equals("Karishma")) {
			System.out.println("Karishma is a Superhero");
			

		}else {
			System.out.println("Sorry i dont about this person");
		}
	}
	
	public static void main(String[] args) {
	  
		Whoisthehero whoisthehero = new Whoisthehero();
		whoisthehero.Superheroorguesser();
		

	}

}
