package Stringconcept;

public class StringBufferexamples {

	public static void main(String[] args) {

		System.out.println("String is immutable");

		String name="Arya";

		System.out.println("Appending name to the original "+name.concat("prasath"));
		System.out.println("name is "+name);

		System.out.println("String is immutable");

		StringBuffer name1 = new StringBuffer("Arya");
		System.out.println("Appending name to the original "+name1.append("prasath"));
		System.out.println("name is "+name1);

		System.out.println("Reversed name is "+name1.reverse());

		StringBuffer replacethis =new StringBuffer("Arul");

		System.out.println(replacethis.replace(0, 3, "Riya"));

		StringBuffer delete = new StringBuffer("xyzRiya");
		System.out.println(delete.delete(0, 3));

		StringBuffer insert =new StringBuffer("Moni");
		System.out.println(insert.insert(4,"sha"));

		System.out.println(insert.capacity());



	}

}
