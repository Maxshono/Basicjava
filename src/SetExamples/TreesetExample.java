package SetExamples;

import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(3);
		
		System.out.println("Elements are sorted on ascending order :"+ treeSet);
	
		System.out.println("treeset first "+treeSet.first());
		System.out.println("Last element :"+treeSet.last());
		System.out.println("Last element :"+treeSet.headSet(7));
		
		System.out.println("Values equal to and higher than given value"+treeSet.tailSet(9));
	
		System.out.println("Subset values :"+treeSet.subSet(2, 9));
		
		System.out.println("Comparator returns null if the sorting is default natural order :"+ treeSet.comparator());
		/*
		 * treeSet.add(null); System.out.println(treeSet);
		 */
	
	
	}

}
