package studentList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {
	private String groupName;
	//private final Student[] students = new Student[10];
	private List<Student> students = new ArrayList<>();
	public Group(String groupName ) {
		super();
		this.groupName = groupName;
		
		
	}
	public Group() {
		super();
		
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Student> getStudents() {
		return students;
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + students.toString() + "]";
	}
	
	public void addStudent(Student student) throws GroupOverflowException{

		if ( students.size()<10 ) {
			    students.add(student);
				student.setGroupName(groupName);
				for(int j= 0;j<students.size();j++) {
					student.setId(j+1);
				}
				
				System.out.println("The student "+ student.getName() + "  " + student.getLastName()+ " successfully  added to " + student.getGroupName()+" group"  );
				return;
			
		}

		throw new GroupOverflowException("The group is full,  can't add a " + student.getName() + "  " + student.getLastName());
		
	}
	
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (Student student : students) {
			if (student.getLastName().equals(lastName)) {
				return student;
			}
		}
		throw new StudentNotFoundException("There is no such student in the group!");
	}
	
	
	
	 public boolean removeStudentByID(int id) {
		 for (Student student : students) {
				if (student.getId() == id) {
					students.remove(students.indexOf(student));
				    return true;
				}
			}
			System.out.println("the student with id: " + id + " not found!");
			return false;
	 }
	 
	 
	
	@SuppressWarnings("unchecked")
	public void sortStudentsByLastName() {
			Collections.sort(students, Comparator.nullsLast((new LastNameComparator())));
			}
	 
	 
	 public boolean areEquivalentStudent() {
		 for (Student student : students) {
				int count = Collections.frequency(students, student);
				if (count > 1) {
					System.out.println("there are equivalent students in the group");
					return true;
					
				}
			}
			System.out.println("there are no equivalent students in the group");
			return false;
			
	 }
	
}
