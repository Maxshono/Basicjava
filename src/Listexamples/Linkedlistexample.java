package Listexamples;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList< Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		System.out.println("Linked List :"+ linkedList);
		linkedList.addFirst(1);
		System.out.println("Linked List after adding first:"+ linkedList);
		
		linkedList.addLast(5);
		System.out.println("Linked List after adding last:"+ linkedList);
		
		System.out.println("First Value :" +linkedList.getFirst());
		System.out.println("First Value using index :"+linkedList.get(0));
		
		System.out.println("Third value of the list : "+ linkedList.get(3));
		
		Integer newFirst =linkedList.get(0);
		linkedList.set(0, newFirst);
		System.err.println("After 0th position updated :"+linkedList);
		
		
		System.out.println("Remove first :"+linkedList.removeFirst());
		System.out.println("Remove last :"+linkedList.removeLast());
		
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		
		linkedList.pollLast();
		System.out.println(linkedList);
		
		linkedList.remove();
		System.out.println(linkedList);
		
		linkedList.addFirst(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		
		linkedList.removeFirstOccurrence(2);
		System.out.println("After removing the first occurence of 2 "+ linkedList );
		
		
		linkedList.removeLastOccurrence(6);
		System.out.println("After removing the last occurence of 6 "+ linkedList );
		
		LinkedList<String> linkedList2 = new LinkedList<String>();
		linkedList2.add("a");
		linkedList2.add("b");
		linkedList2.add("c");
		linkedList2.add("d");
		System.out.println("Simple For loop");
		
		for(int index=0;index<linkedList.size(); index++) {
			System.out.println("Elements in the LL are "+ linkedList.get(index));
		}
		
		
		for (String string : linkedList2) {
			System.out.println(string);
			
		}
		
		int number=0;
		System.out.println("While");
		
		while (linkedList2.size()>number) {
			System.out.println("Elements in the LL are "+ linkedList2.get(number));
			number++;
			
		}
		
		
		Iterator<String> iterator=linkedList2.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Elements in the LL are "+ iterator.next());
			
		}
		
		
	}

}
