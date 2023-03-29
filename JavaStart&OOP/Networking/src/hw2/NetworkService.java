package hw2;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class NetworkService {

	public static void  isAvailableURL(File file) throws IOException {
		
		try (Scanner sc = new Scanner(file)) {
			for(;sc.hasNextLine();) {
				String strURL = sc.nextLine();
				URL url = new URL (strURL);
				HttpURLConnection urlConect = (HttpURLConnection) url.openConnection();
				if(urlConect.getResponseCode() > 200 && urlConect.getResponseCode() <400) {
					System.out.println(strURL + " is avaliable");
				}
					System.out.println(strURL + " is not avaliable");
				
				
			}
		
		}	
		
		
		
	}
	
	
	
	
	}	
		
		

		
	
	

