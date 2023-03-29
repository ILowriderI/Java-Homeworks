package port;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);

		service.submit(new Ship(10,"Queen Anne's Revenge"));
		service.submit(new Ship(10,"Titanic"));
		service.submit(new Ship(10,"Yellow Submarine"));

	}
}
