package StaticMethodspac;

public class StaticMethods {
	
	
	

	public static void method1() {
		System.out.println("Static Method");
	}
	
	public void nonstaticmethod() {
		System.out.println("Non-static method");
	}

	public static void main(String[] args) {
		  StaticMethods methods = new StaticMethods();

		method1();
		
		
	}

}
