package Abstractionpack;

public class BMW extends Car implements UpcomingProject,Interface2{

	
	
@Override
	public void EngineSecret() {
		System.out.println("BMW Engine Secret");
	}

@Override
	public void Companyvault() {
		System.out.println("Bmw Company vault");
	}

	public static void main(String[] args) {
		
		Car car = new BMW();
		car.Companyvault();
		car.EngineSecret();

	}

	@Override
	public void Method1() {
		System.out.println("Method 1");
		
	}

	@Override
	public void Method2() {
		System.out.println("Method 2");
		
	}

}
