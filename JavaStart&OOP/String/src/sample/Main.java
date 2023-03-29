package sample;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 //#2
		 Scanner sc = new Scanner(System.in);
		    String text;
		    System.out.println("Input some string");
		    text = sc.nextLine();
		    String [] strAr = text.split(" ");
		    String result = "";
		    
		    for(int i = 0; i < strAr.length; i++) {
		    	if(strAr[i].length() >= result.length()) {
		    		result = strAr[i];
		    	}
		    }
		    
		    System.out.println("longest word in a string : " + result);
		
		
		       
	}

}

/*
 package sample;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//#1
		 Scanner sc = new Scanner(System.in);
		    String text;
		    System.out.println("Input some text");
		    text = sc.nextLine();
		    char [] textArray = text.toCharArray();
		    int b = 0;
		    
		    for(int i = 0; i <textArray.length;i++) {
		    	if(textArray[i]=='b') {
		    		b++;
		    		}
		    }
		    	
		    System.out.println("characters 'b' : " + b);
		    
		    
		    //#2
		  //#2
		 Scanner sc = new Scanner(System.in);
		    String text;
		    System.out.println("Input some string");
		    text = sc.nextLine();
		    String [] strAr = text.split(" ");
		    String result = "";
		    
		    for(int i = 0; i < strAr.length; i++) {
		    	if(strAr[i].length() >= result.length()) {
		    		result = strAr[i];
		    	}
		    }
		    
		    System.out.println("longest word in a string : " + result);
		    
		   
		    //#3
		
		 for(int i = 2 ; i < 12; i++) {
			  
			 System.out.println(String.format("%." + i + "f", Math.PI));
		 }
		   
		    
         
	}

}
 
 
 
 */




