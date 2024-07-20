package SetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexamples {

	public static void main(String[] args) {
	
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("A");
		hashset.add("D");
		hashset.add("E");
		hashset.add("F");
		hashset.add("A");
	//	hashset.add("null");
		System.out.println("Contents of the HashSet :"+ hashset);
		
Iterator<String> iterator=hashset.iterator();

while(iterator.hasNext()) {
	System.out.println("Elements of HashSet :"+ iterator.next());
}
	}

}
