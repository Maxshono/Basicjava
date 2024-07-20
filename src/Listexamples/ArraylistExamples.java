package Listexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistExamples {

	public static void main(String[] args) {



		List<String> arraylist = new ArrayList<String>();
		arraylist.add("Audi");
		arraylist.add("Benz");
		arraylist.add("Bugatti");
		arraylist.add("Aston martin");

		System.out.println(arraylist);

		arraylist.add(0, "Mustang");

		System.out.println(arraylist);

		System.out.println("Index position of audi is "+arraylist.indexOf("Audi"));

		System.out.println("Index position of Ambassador is :"+arraylist.indexOf("Ambassador"));

		arraylist.add("Mustang");
		System.out.println(arraylist);
		System.out.println("Index position of Mustang is :"+arraylist.indexOf("Mustang"));
		System.out.println("Last index position of Mustang is "+arraylist.lastIndexOf("Mustang"));


		List<String> anotherlist = new ArrayList<String>();

		anotherlist.addAll(arraylist);

		System.out.println("New List copied :"+ anotherlist);

		anotherlist.clear();
		System.out.println("List after clearing "+anotherlist);

		anotherlist.add(null);
		System.out.println("After adding null "+anotherlist);
		anotherlist.add("mango");
		anotherlist.add("Banana");
		anotherlist.addAll(0, anotherlist);
		System.out.println("New list after adding the old list at 0th position :"+anotherlist);
		
		anotherlist.set(4, "Tata");
		anotherlist.set(5, "Civics");
		System.out.println("List after updating the last two elements : "+anotherlist);
		

		anotherlist.remove(5);
		System.out.println("After removing :"+anotherlist);
		
		anotherlist.remove("Tata");
		System.out.println("After removing Civic: "+ anotherlist);
		
		System.out.println("Element at 5th Position "+anotherlist.get(2));

		System.out.println("This list is empty. True or False? "+ anotherlist.isEmpty());
		System.out.println(anotherlist);

for (int size = 0; size < anotherlist.size(); size++) {
	System.out.println("Element at "+size+" th position"+anotherlist.get(size));
	
	
	for (String string : anotherlist) {
		System.out.println("List element"+string);
	}
		System.out.println("*********************************");
		ListIterator<String> listIterator= anotherlist.listIterator();
		while(listIterator.hasNext()){
			System.out.println("Forward Iteration : "+listIterator.next());
		}
		
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
		
		
		Iterator<String> iterator =anotherlist.iterator();
		
		while(iterator.hasNext()) {
		
			System.out.println("Forward Only:"+iterator.next());
		}
		
		/*
		 * try {
		 * 
		 * for (String string : anotherlist) {
		 * 
		 * System.out.println("Reading the list values"+ string);
		 * anotherlist.add("Mustang"); }
		 * 
		 * } catch (Exception e) {
		 * 
		 * 
		 * System.out.
		 * println("Dude! You are trying to modify a list while a read operation is happening"
		 * ); // TODO: handle exception }
		 */
		
		
			CopyOnWriteArrayList<String> syncal = new CopyOnWriteArrayList<String>();
			syncal.add("Pen");
			syncal.add("NoteBook");
			syncal.add("Ink");
			System.out.println("Iterating synchronized ArrayList:");
			

			Iterator<String> syncIterator = syncal.iterator(); 
			while (syncIterator.hasNext()){
				System.out.println(syncIterator.next());
				syncal.add("Eraser");
				syncal.remove("Eraser");


		}
			System.out.println("Final List: "+syncal);
	}
}



}


	

