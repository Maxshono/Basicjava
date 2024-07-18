package Constructors;

public class Draw {

	String draw;
	public Draw() {
		System.out.println("Draw object is created");
	}
	
	public Draw(String todraw) {
		
		draw=todraw;
		
		System.out.println("Drawing is "+todraw);
	}
	
	
	public static void main(String[] args) {
		  
		Draw draw= new Draw();
		Draw draw2= new Draw("circle");
		

	}

}
