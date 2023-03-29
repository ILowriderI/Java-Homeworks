package studentObj;

import java.util.Scanner;

public class CreateNewStudentWithScanner {
	public static Student inputStudent() {
		
		Student  newStudent = new Student(null, null, null, null, 0);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input student your name");
		newStudent.setName(sc.nextLine()); 
		System.out.println("Input student lastname");
		newStudent.setLastName(sc.nextLine()); 
		System.out.println("Input student gender( male or female)");
		newStudent.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));
		System.out.println("Input student ID");
		newStudent.setId(sc.nextInt()); 
		
		System.out.println(newStudent.toString());
		return newStudent;	
		
		
		
	}
}
