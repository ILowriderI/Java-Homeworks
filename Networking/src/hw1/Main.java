package hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {

		String spec = "https://github.com/";
		File file = new File("URLs.txt");

		NetworkService.saveURL(spec, file);
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				System.out.println(text);
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
