package hw2;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args)  {
	File file = new File("C:\\Users\\User\\Desktop\\1\\URLsList.txt");
	
		try {
			NetworkService.isAvailableURL(file);
		} catch (IOException e) {
			System.out.println(e +" not available or does not exist");
			
		}
	
	}
}
