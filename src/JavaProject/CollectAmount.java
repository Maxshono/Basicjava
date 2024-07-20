package JavaProject;

public class CollectAmount {

	
	Integer collectedamount=2000;
	
	
	public Integer collectamountandgiveittome() {
		System.out.println("Daddy i have collected amount is "+collectedamount+ "and sent it to u");
		return collectedamount;
	}
	public static void main(String[] args) {
		

		CollectAmount myson = new CollectAmount();
		
	Integer amount=	myson.collectamountandgiveittome();
		
		System.out.println("Got the amount son"+amount);
	}

}
