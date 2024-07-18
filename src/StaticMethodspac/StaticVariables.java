package StaticMethodspac;

public class StaticVariables {

	
	static int accountbalance=0;
	String depositedby;
	
	public static void main(String[] args) {
		
		
		StaticVariables object = new StaticVariables();
		object.accountbalance=1000;
		object.depositedby="Max";
		
		
		

		StaticVariables object1 = new StaticVariables();
		object1.accountbalance=2000;
		object1.depositedby="Shono";
		
		System.out.println("account balnce is "+object.accountbalance);
		System.out.println("Deposited by "+object.depositedby);
		
		System.out.println("account balnce is "+object1.accountbalance);
		System.out.println("Deposited by "+object1.depositedby);
		
		

	}

}
