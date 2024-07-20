package Constructors;

public class Employee {

	
	int Employee_id;
	
	String employeename;
	
	public Employee() {
	 Employee_id=123;
	 employeename="Max";
	 System.out.println("Employee object is created");
	}
	public static void main(String[] args) {
		
		Employee employee = new Employee();
	}

}
