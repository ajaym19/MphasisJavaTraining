package Basics;

public class StringsDemo {

	public static void main(String[] args) {
		//using string literal
		//using new keyword
		
		String name = "Ajay";
		System.out.println(name); //Ajay
		name = name.concat("Trainer");
		System.out.println(name); //
		
		
		String s3 = new String("Hello");
		System.out.println(s3); //hello
		s3.concat("World");
		System.out.println(s3); //hello
		
		
		//mutable representation of string classes
		
		StringBuffer sb = new StringBuffer("Ajay");
		System.out.println(sb); //Ajay
		sb.append("Trainer");
		System.out.println(sb); //Ajay

	}
}
