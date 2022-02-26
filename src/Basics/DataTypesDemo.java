package Basics;

public class DataTypesDemo {

	//CTRL+SPACE
	
	/*
	 * Data Types:
	 * 1. Primitive - 
	 * 		byte, short, int, long >> Integer values
	 * 		float, double >> Decimal values
	 * 		char - single character
	 * 		boolean - yes/no
	 * 
	 * Bucket Principle
	 * 
	 * B1 >> 3L
	 * B2 >> 5L
	 * 
	 * 2. Non Primitive: array, strings
	 */
	
	public static void main(String[] args) {
		System.out.println("Ajay");
		byte b = 22;
		int i = 43434;
		
		System.out.println(b);
		
		float f1 = 34.55f;
		double d = 3434.56;
		
		char c1 = 'B';
		
		boolean b2 = false;
		boolean b3 = true;
		
		
		int i4;
		float f4;
		f4 = 34.95f;
		i4 = (int)f4;
		System.out.println(f4); //34.45
		System.out.println(i4); //
		
		//int to char
		
		//A >> 65
		
		//int to string
		int i5 = 45;
		String s1;
		s1 = Integer.toString(i5);
		System.out.println(s1);
		
		//string to int
		int i6 = Integer.parseInt("123");
		
		
		
		
		
		
		
	}
}
