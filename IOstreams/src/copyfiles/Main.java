package copyfiles;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		   File folderIn = new File("C:\\Users\\User\\Desktop\\1");
		    
		    File folderOut = new File("CopyFiles");
		    folderOut.mkdirs();
		    String type = ".docx";
		    try {
		      System.out.println(FileService.copyFileByType(folderIn, folderOut, type));
		    } catch (IOException e) {
		     
		      e.printStackTrace();
		    }

	}

}
