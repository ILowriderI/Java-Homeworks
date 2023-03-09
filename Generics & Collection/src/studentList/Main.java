package studentList;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
           // group.addStudent(thor);
           // group.addStudent(tony);
           // group.addStudent(daisy);
            group.addStudent(marquis);
           
            
        } catch (GroupOverflowException e){
            e.printStackTrace();
            
        }
        group.areEquivalentStudent();
        group.sortStudentsByLastName();
       // System.out.println(group);
       
        
        
       
         
        File saveFromCSV = new File("C:\\Users\\User\\Desktop\\1\\newHatefulTen.csv");
		GroupFileStorage groupFile = new GroupFileStorage();
		groupFile.saveGroupToCSV(group);
		
		groupFile.loadGroupFromCSV(saveFromCSV);
		System.out.println(groupFile.loadGroupFromCSV(saveFromCSV).toString());


		
		File searchDirect = new File("C:\\Users\\User\\Desktop\\1");
		groupFile.findFileByGroupName("newHatefulTen3", searchDirect);
		System.out.println(groupFile.findFileByGroupName("newHatefulTen3", searchDirect));

		
         
         
        
	}

	
	
	
	    
	
}
