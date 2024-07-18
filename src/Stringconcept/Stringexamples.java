package Stringconcept;

public class Stringexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Maxshono";
		
		System.out.println(name.charAt(1));
		
		System.out.println(name.length());
		
		System.out.println(name.equals("Max"));
		
		System.out.println(name.equalsIgnoreCase("MAXSHONO"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.contains("x"));
		
		System.out.println(name.substring(1));
		
		System.out.println(name.substring(1,3));
		
		System.out.println(name.concat("KGS"));
		
		
		
		System.out.println(name.replace("a", "A"));
		
		System.out.println(name.replace("Max","Science"));
		
		System.out.println(name.indexOf("x"));
		
		System.out.println(name.indexOf("o",5));

		System.out.println(name.indexOf("Max",1));
		
		System.out.println(name.trim());
		
		String uppercase="MAXSHONO";
		System.out.println(uppercase.toLowerCase());

		
		String lowercase="maxshono";
		System.out.println(lowercase.toUpperCase());
		
		
		System.out.println(String.join("-","Learn", "Automation","online"));
		
		System.out.println(String.join("/","30", "05","1999"));
		
		
		String splitthis="Am, i, teaching, good";
		
		String[] splittedwords =splitthis.split(",");
		
		for(String  string:splittedwords) {
			System.out.println(string);
		}
		


}
}