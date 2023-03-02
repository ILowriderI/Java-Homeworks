package sample;
import java.util.Scanner;
public class Main {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number from 4 to 16");
	      int n = sc.nextInt();
	      int result = 1;
	      if(n<4) {
	        System.out.println("You entered the wrong number ! ");
	      }else if(n>16) {
	        System.out.println("You entered the wrong number ! ");  
	      }else{
	        for(int i = 1;i<=n;i++) {
	          result = result *i;
	          
	        }
	        System.out.println("Factorial of the entered number : " +  result);
	      }
		  //#2
	    
	    for(int i = 1;i <= 10;i++) {
	      System.out.print(i +" * 5 = ");
	      System.out.println( i*5 );
	    }
	//#3
		 // Scanner sc = new Scanner(System.in);
		    int width;
		    int height;
		    System.out.println("Input width");
		    width = sc.nextInt();
		    System.out.println("Input height");
		    height = sc.nextInt();
	
		    for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                if (j == 0 || j == width - 1 || i == 0 || i == height - 1) {
	                    System.out.print("#");
	                } else
	                    System.out.print(" ");
	            }
	            System.out.println();

	        }
		
	}

}
