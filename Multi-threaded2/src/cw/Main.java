package cw;

public class Main {

	public static void main(String[] args) {
		
		 Printer prn = new Printer();

		    PrinterTask task1 = new PrinterTask(prn, "Hello");
		    PrinterTask task2 = new PrinterTask(prn, "World");

		    Thread thread1 = new Thread(task1);
		    Thread thread2 = new Thread(task2);

		    thread1.start();
		    thread2.start();
		  }

}
