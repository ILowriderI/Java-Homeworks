package studentList;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class GroupFileStorage {

	public void saveGroupToCSV(Group group) {
		File file = new File(group.getGroupName() + ".csv");
		List<Student> students = group.getStudents();
        
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < students.size(); i++) {
				
					pw.println(students.get(i).getGroupName() + ";" + students.get(i).getName() + ";"
							+ students.get(i).getLastName() + ";" + students.get(i).getGender() + ";" + students.get(i).getId());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public Group loadGroupFromCSV(File file) {
		Group group = new Group();
		group.setGroupName(file.getName().substring(0, file.getName().indexOf(".")));
		
		try (Scanner sc = new Scanner(file)) {
			while( sc.hasNextLine()) {

			    String [] arr = sc.nextLine().split(";");
			    Student student = new Student(arr[1],arr[2], Gender.valueOf(arr[3]),arr[0],Integer.valueOf(arr[4]));
				try {
					group.addStudent(student);
				} catch (GroupOverflowException e) {
					
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return group;
	}
	
	
	
	public File findFileByGroupName(String groupName, File workFolder) {
		File[] workFolderFiles = workFolder.listFiles();
		for (int i = 0; i < workFolderFiles.length; i++) {
			if (workFolderFiles[i].getName().equals(groupName + ".csv")) {
				return workFolderFiles[i];
			}
		}
		return null;
	}
	
	
		
	}


