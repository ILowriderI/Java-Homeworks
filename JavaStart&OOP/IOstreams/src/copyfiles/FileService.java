package copyfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {
	
	
	 public static long copyFile(File fileIn, File fileOut) throws IOException {
		    try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
		      return is.transferTo(os);
		    }
		  }

	 
	 public static int copyFileByType(File folderIn, File folderOut, String type) throws IOException {
		    File[] files = folderIn.listFiles();
		    int copyFile = 0;
		    
		    for (int i = 0; i < files.length; i++) 
		      if (files[i].isFile() && files[i].getName().endsWith( type)) {
		        File fileOut = new File(folderOut, files[i].getName());
		        copyFile(files[i], fileOut);
		        copyFile += 1;
		      }
	 
		    return copyFile;
		  }
	 
	
}
