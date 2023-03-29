package cw;
import java.io.File;
import java.io.IOException;
public class Main {

	  public static void main(String[] args) {
	    File fileIn = new File("/home/alexander/Изображения/5-klas-matematika-merzljak-2018.pdf");

	    File fileOut = new File(fileIn.getName());

	    try {
	      System.out.println(FileService.copyFile(fileIn, fileOut));
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    
	   
	    	
	    
	    

	  }
	}