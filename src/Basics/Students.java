package Basics;

public class Students {

	int id;
	String name;
	int grade;
	char division;
	long mobileNumber;
	String dept;
	static String schoolName;
	
	public Students() {
		System.out.println("I am in constructor");
	}

	public void study() {
		System.out.println("Students are studying");
	}
	
	public void attendLectures() {
		//System.out.println(i);
		System.out.println("Students are atttending lectures");
	}
	
	public void demo() {
		int i = 4;
		System.out.println(i);
		System.out.println(name);
		System.out.println(schoolName);
		attendLectures();
		showInfo();
	}
	
	public static void showInfo() {
		System.out.println("Showing info");
		//System.out.println(name);
		System.out.println(schoolName);
	
	}
	
}
