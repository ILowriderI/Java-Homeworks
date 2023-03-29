package sample;

import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//import java.util.Random;
//import java.util.Arrays;

public class Main {


	public static void main(String[] args) {
		
		 File mainFolder = new File(".");
		 File myFolder = new File("My Folder");
		 myFolder.mkdirs();
		 File[] folder = mainFolder.listFiles();
		 System.out.println("folder list :");
	 	 showFolder(folder);
		 	
	}
	
	public static void showFolder(File[] folder) {
		
		 for (int i = 0; i < folder.length; i++) {
			 	
		     if (folder[i].isDirectory()) {
		    	 System.out.println(folder[i]);
		     }
		    
		 }
		
	}
	 

}

  


/*
 //#1
 package sample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	  File file = new File("info.txt");
    String text = scannerText();
    saveTextToFile(text,file);

  }
  
  public static String scannerText() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter information to save");
	  String text = sc.nextLine();
	  return text;
  }
  

  public static void saveTextToFile(String text,File file) {
	    
	  
		  try (PrintWriter pw = new PrintWriter(file)) {
			  pw.println(text);
		      
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		  System.out.println("done");
	  }
	  
	 

}
 
 
 
 */




/*
 #2
 
 package sample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

	  public static void main(String[] args) {
	    File file = new File("array.txt");
	    int[][] array = createRanArray(5);
	    System.out.println(Arrays.deepToString(array));
	    saveArrayToFile(array,file);
	    
	  }
	  
	  public static int [][] createRanArray(int num){
		  Random rnd = new Random();
	        int[][] array = new int[num][num];
	        for (int i = 0; i < num; i++) {
	            for (int j = 0; j < num; j++) {
	                array[i][j] = rnd.nextInt(0,10);
	            }
	        }
	        return array;
	  }

	  public static void saveArrayToFile(int[][] array, File file) {
	  
	      try (PrintWriter pw = new PrintWriter(file)) {
	    	  pw.print("[");
	        for(int i = 0;i < array.length;i++) {
	        	pw.print("[");
	        	for(int j = 0;j < array.length;j++) {
	        		pw.print(array[i][j]);
	        		pw.print(",");
	        	}
	        	pw.print("]");
	        	pw.print(",");
	        	pw.println(" ");
	        }
	        pw.print("]"); 
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	    }
	 

}
 */











