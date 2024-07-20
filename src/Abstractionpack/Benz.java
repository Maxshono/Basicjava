package Abstractionpack;

public class Benz extends Car implements UpcomingProject{
	
	
	
@Override
	public void EngineSecret() {
		System.out.println(" Benz Engine Secret");
	}

@Override
	public void Companyvault() {
		System.out.println(" Benz Company vault");
	}
	public static void main(String[] args) {
	
		Car car = new Benz();
		car.Companyvault();
		car.EngineSecret();
	}

	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Method2() {
		// TODO Auto-generated method stub
		
	}

}
