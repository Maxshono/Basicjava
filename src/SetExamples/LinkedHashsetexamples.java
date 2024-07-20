package SetExamples;

import java.util.LinkedHashSet;

public class LinkedHashsetexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet hashSet = new LinkedHashSet();
		hashSet.add(1);
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("10");
		
		System.out.println("Insertion Order preserved Linked Hash Set :"+ hashSet);
	}

}
