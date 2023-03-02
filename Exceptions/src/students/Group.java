package students;

import java.util.Arrays;

public class Group {
	private String groupName;
	private final Student[] students = new Student[10];
	public Group(String groupName) {
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
	public Student[] getStudens() {
		return students;
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}
	
	public void addStudent(Student student) throws GroupOverflowException{
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				student.setGroupName(groupName);
				student.setId(i + 1);
				students[i] = student;
				System.out.println("The student "+ student.getName() + "  " + student.getLastName()+ " successfully  added to " + student.getGroupName()+" group"  );
				return;
			}
		}

		throw new GroupOverflowException("The group is full,  can't add a " + student.getName() + "  " + student.getLastName());
		
	}
	
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (int i = 0; i < students.length; i++) {
			if ((students[i] != null) && (students[i].getLastName().equalsIgnoreCase(lastName))) {
				System.out.println("This student found , his id : " + students[i].getId());
				return students[i];
			}
		}
		throw new StudentNotFoundException("There is no such student in the group!");
	}
	
	 public boolean removeStudentByID(int id) {
		 for (int i = 0; i < students.length; i++) {
				if ((students[i] != null) && (students[i].getId() == id)) {
					System.out.println("the student was removed from the id: " + id +" his name " + students[i].getName()+ " " + students[i].getLastName());
					students[i] = null;
					
					return true;
				}
			}
			System.out.println("the student with id: " + id + " not found!");
			return false;
	 }
	
}
