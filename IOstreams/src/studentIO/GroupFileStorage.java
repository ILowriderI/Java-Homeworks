package studentIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GroupFileStorage {

	public void saveGroupToCSV(Group group) {
		File file = new File(group.getGroupName() + ".csv");
		Student[] students = group.getStudents();

		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null) {
					pw.println(students[i].getGroupName() + ";" + students[i].getName() + ";"
							+ students[i].getLastName() + ";" + students[i].getGender() + ";" + students[i].getId());
				}
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


