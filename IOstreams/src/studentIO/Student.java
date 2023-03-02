package studentIO;



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
	
	
	
}
