package Listexamples;

import java.util.Collections;
import java.util.Vector;

public class VectorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector< String> vector= new Vector<String>();
		
		vector.addElement("Steve");
		vector.addElement("Bill");
		vector.addElement(null);
		vector.addElement("Sundar");
		vector.addElement("Satya");
		vector.addElement("Sergey");
		System.out.println("Vector "+ vector);
		
		System.out.println("Element At 0th pos is "+ vector.elementAt(0));
		
		vector.removeElement(null);
		System.out.println(vector);
		
		System.out.println(vector.subList(1, 3));
		
		
		Vector<String> vector2= new Vector<String>();
		vector2.addElement("A");
		vector2.addElement("B");
		vector2.addElement("C");
		System.out.println("Vector1 before copying:" + vector);
		System.out.println("Vector2 before copying:" + vector2);
		
		
		Collections.copy(vector, vector2);
		System.out.println("Vector1 after copying:" + vector);
		System.out.println("Vector2 after copying:" + vector2);
		
		
		//Size and capacity
				Vector<String> vector3= new Vector<String>(5);
				vector3.addElement("A");
				vector3.addElement("B");
				System.out.println("Vector size is :"+ vector3.size());
				System.out.println("Vector capacity is :"+ vector3.capacity());
		
		
	}

}
