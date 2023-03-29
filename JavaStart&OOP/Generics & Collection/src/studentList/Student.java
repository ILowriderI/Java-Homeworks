package studentList;

import java.util.Objects;

public class Student extends Human {
	private String groupName;
	private int id;
	
	public Student(String name, String lastName, Gender gender, String groupName, int id) {
		super(name, lastName, gender);
		this.groupName = groupName;
		this.id = id;
	}
	
	public Student(String name, String lastName, Gender gender) {
		super(name, lastName, gender);
	}
	
	public Student() {
		super();
		
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [groupName=" + groupName + ", id=" + id + super.toString()+  "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(groupName, other.groupName) && id == other.id;
	}
	
	
	
}
