package factorial;

import java.math.BigInteger;

public class Factorial implements Runnable {
	public BigInteger calcFactorial(int num) {
    	BigInteger factorial = BigInteger.ONE;
    	for(int i = 1; i <= num; i++) {
    		factorial = factorial.multiply(BigInteger.valueOf(i)) ;
    		
    	}
    	return factorial;
    }

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		
		System.out.println(thread.getId() + "-ID  " + thread.getName() + "/factorial " + thread.getId() + "! = "
				+ this.calcFactorial((int) thread.getId()));
		
	}
     
	
}
