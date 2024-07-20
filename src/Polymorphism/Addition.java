package Polymorphism;

public class Addition {

	
		
		
		int add(int n1, int n2) {
			
	return n1+n2;
	} 
		
		
		int add(int n1, int n2,int n3) {
			
	return n1+n2+n3;
	}
		
		float add(float n1, float n2) {
			return n1+n2;
		}
		public static void main(String[] args) {
			Addition obj = new Addition();
			System.out.println("Sum of two number"+obj.add(30, 100));
			System.out.println("Sum of three number"+obj.add(10, 20, 30));
		}
}
