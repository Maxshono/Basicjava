package ConditionalStatement;

public class Superheroornot {



	String hero="Spiderman";



	public void Superheroornot() {
		switch (hero) {
		case "Spiderman":
			System.out.println("Spiderman is a hero");

			break;

		case "Powerman":

			System.out.println("Powerman is a hero");

			break;


		case "Max":

			System.out.println("Max is a hero");

			break;


		default:
			System.out.println("Sorry i can't guess");
			
		}
	}


	public static void main(String[] args) {

		Superheroornot superheroornot = new Superheroornot();

		superheroornot.Superheroornot();
	}

}
