package sample;

public class Main {

	public static void main(String[] args) {
		Student vincent = new Student("Vincent", "Vega", Gender.MALE );
		Student jules = new Student("Jules", "Winnfield", Gender.MALE);
		Student butch = new Student("Butch", "Coolidge", Gender.MALE);
		Student mia = new Student("Mia", "Wallace", Gender.FEMALE);
		Student marsellus = new Student("Marsellus", "Wallace", Gender.MALE);
		Student king = new Student("King", "Schultz", Gender.MALE);
		Student calvin = new Student("Calvin", "Candie", Gender.MALE);
		Student marquis = new Student("Marquis", "Warren", Gender.MALE);
		Student daisy = new Student("Daisy", "Domergue", Gender.FEMALE);
		Student thor = new Student("Thor", "OdinSon", Gender.FEMALE);
		Student tony = new Student("Tony", "Stark", Gender.FEMALE);
		
		
        Group group = new Group("Hateful ten");
        
        try {
            
            group.addStudent(vincent);
            group.addStudent(jules);
            group.addStudent(butch);
            group.addStudent(mia);
            group.addStudent(marsellus);
            group.addStudent(king );
            group.addStudent(calvin);
            group.addStudent(marquis);
            group.addStudent(daisy);
            group.addStudent(thor);
            group.addStudent(tony);
           

        } catch (GroupOverflowException e){
            e.printStackTrace();
        }
        
        group.sortStudentsByLastName();
        
        try {
        	group.searchStudentByLastName("odinson");
        	group.searchStudentByLastName("ignat");
        }catch(StudentNotFoundException e) {
        	e.printStackTrace();
        }

        group.removeStudentByID(9);
        System.out.println(group.toString());
        
        
        Group newGroup = new Group("newGroup");
           
         Student newStud = CreateNewStudentWithScanner.inputStudent();
         try {
			newGroup.addStudent(newStud);
		} catch (GroupOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
         System.out.println(newGroup.toString());
         System.out.println(newStud.toString());
        
	}
	
	
	    
	
}
