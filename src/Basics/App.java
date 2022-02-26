package Basics;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.name = "Sneha";
		s1.grade = 10;
		s1.mobileNumber = 4545;
		s1.schoolName = "IIT";
		s1.attendLectures();
		
		System.out.println("Printing Sneha details");
		System.out.println(s1.name); //sneha
		System.out.println(s1.grade); //10
		System.out.println(s1.schoolName); //IIT
		
		Students s2 = new Students();
		s2.name = "Nikhil";
		System.out.println("Printing Nikhil details");

		System.out.println(s2.name); //Nikhil
		System.out.println(s2.grade); //0
		System.out.println(s2.schoolName); //IIT
		
		System.out.println(Students.schoolName);
		Students.showInfo();
		
	}
}
