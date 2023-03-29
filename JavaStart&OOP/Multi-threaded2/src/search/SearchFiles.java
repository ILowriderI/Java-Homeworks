package search;

import java.io.File;

public class SearchFiles implements Runnable {
	
	private File file;
	private String name;
	
	
	public SearchFiles(String name, File file) {
		super();
		this.name = name;
		this.file = file;
	}
	public static void findFile(String name, File folder) {

		if (folder.isFile()) {
			if (folder.getName().equals(name)) {
				System.out.println(folder);
				
			}
		} else {
			File[] files = folder.listFiles();
			for (int i = 0; i < files.length; i++) {
				findFile(name, files[i]);
				
			}
		}
		
		
	}


	@Override
	public void run() {
		findFile(name, file);
		
	}

}

 