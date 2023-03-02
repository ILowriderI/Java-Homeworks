package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	  public static void main(String[] args) {
		//#4
		  int[] array = new int [] {0,3,6,9,12,15};
		  System.out.println(Arrays.toString(array));
		  
	        for (int i = 0; i < array.length / 2; i++) {
	            int temp = array[i];
	            array[i] = array[array.length - 1 - i];
	            array[array.length - 1 - i] = temp;
	        }
		System.out.println(Arrays.toString(array));
  }

}







/*
  //#1
    int[] array = new int[]{0,5,2,4,7,1,3,19};
    int count = 0;
    for(int i = 0; i < array.length; i++) {
    	if(array[i] % 2 != 0) {
    		count++;
    	}
    }
    System.out.println( "Sum of odd numbers : " + count);
    #2
     Scanner sc = new Scanner(System.in);
		  System.out.println("Input array length");
		  int arrayLength = sc.nextInt();
		  int [] array = new  int[arrayLength] ;
		  for(int i = 0;i < arrayLength;i++) {
			  System.out.println("Inputn next value");
			  int value = sc.nextInt();
			  array[i]= value;
			  
		  }
	  System.out.println(Arrays.toString(array));
    
     //#3
		  Random rn = new Random();
		    int[] array = new int[15];
		    for (int i = 0; i < array.length; i++) {
		      array[i] = rn.nextInt(1,10);
		    }

		    System.out.println(Arrays.toString(array));
		  int[] newArray = new int[array.length * 2 ];
		    for(int i = 0 ; i < array.length;i++) {
		    	newArray[i] = array[i];
		    	newArray[array.length + i] = 2*array[i];
		    
		    }
		    System.out.println(Arrays.toString(newArray));
		    
		    
		  //#4
		  int[] array = new int [] {0,3,6,9,12,15};
		  System.out.println(Arrays.toString(array));
		  
	        for (int i = 0; i < array.length / 2; i++) {
	            int temp = array[i];
	            array[i] = array[array.length - 1 - i];
	            array[array.length - 1 - i] = temp;
	        }
		System.out.println(Arrays.toString(array));  
		    
		    
		  
		    
		    
		    
    
 */
