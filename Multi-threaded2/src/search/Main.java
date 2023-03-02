package search;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		File searchFolder = new File("C:\\Users\\User\\Desktop\\react\\react-star-wars");
		String name = "README.md";

		File[] folders = searchFolder.listFiles();

		ExecutorService service = Executors.newFixedThreadPool(3);
		Runnable[] runs = new Runnable[folders.length];

		for (int i = 0; i < folders.length; i++) {
			runs[i] = new SearchFiles(name, folders[i]);
			service.submit(runs[i]);
		}
		service.shutdown();
	}


	}


