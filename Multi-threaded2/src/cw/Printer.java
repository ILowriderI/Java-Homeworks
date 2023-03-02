package cw;

public class Printer {

	  private Long thrId = null;

	  public synchronized void printText(String text) {
	    long currentId = Thread.currentThread().getId();
	    for (; thrId != null && thrId == currentId;) {
	      try {
	        wait();
	      } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    System.out.print(text + " ");
	    thrId = currentId;
	    notifyAll();
	  }
	}
