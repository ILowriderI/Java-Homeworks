package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//#1
		
		 Scanner sc = new Scanner(System.in);
	        int value1;
	        int value2;
	        int value3;
	        int value4;
	        int maxValue;
	        System.out.println("Input value 1");
	        value1 = sc.nextInt();
	        System.out.println("Input value 2");
	        value2 = sc.nextInt();
	        System.out.println("Input value 3");
	        value3 = sc.nextInt();
	        System.out.println("Input value 4");
	        value4 = sc.nextInt();

	        maxValue = value1;
	        
	        if (value2 > maxValue) {
	          maxValue = value2;
	        }
	        if (value3 > maxValue) {
	          maxValue = value3;
	        }
	        if(value4 > maxValue) {
	          maxValue = value4;
	        }
	        System.out.println("Max value = " + maxValue );
		// #2
	     
	    Scanner sc2 = new Scanner(System.in);
	    
	    System.out.println("Apartment number : ");
	    int apartNum=sc2.nextInt();
	    int entrance=(apartNum-1)/36+1; 
	    int floor =(apartNum-36 * (entrance - 1) -1 ) / 4+1; 
	    if (apartNum >0 && apartNum <= 180){
	      System.out.println("Entrance : " + entrance);
	        System.out.println("Floor : " + floor);
	    }
	    else {
	      System.out.println(" There is no such apartment in this house ");
	    }
	    
	             
	      
		
		
		// #3
		 
		Scanner sc3 = new Scanner(System.in);
        int a,b,c;
        System.out.println("Input a");
        a = sc3.nextInt();
        System.out.println("Input b");
        b = sc.nextInt();
        System.out.println("Input c");
        c = sc.nextInt();
        
        if ((a + b) > c && (a + c) >  b && (b + c) > a) {
            System.out.println("Such a triangle could be )");
        }
            else {
            	System.out.println("Such a triangle could not exist ( ");
            }

            }
        

}
