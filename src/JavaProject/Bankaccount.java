package JavaProject;

public class Bankaccount {



	Long accountNumber=9876543210l;

	String name="Max";

	int Amount=350;

	public void Getaccountnumber() {
		System.out.println("Account number is "+accountNumber);
	}
	public static void main(String[] args) {


		Bankaccount account = new Bankaccount();
		account.Getaccountnumber();
	}

}
