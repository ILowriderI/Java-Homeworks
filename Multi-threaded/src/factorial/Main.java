package factorial;

public class Main {

	public static void main(String[] args) {
		Thread[] threads = new Thread[100];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Factorial());
			threads[i].start();
		}


	}

}
