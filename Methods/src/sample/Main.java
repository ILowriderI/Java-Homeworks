package sample;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	// #1
	    int[] array = new int[] {-4,-8,-20,-7};
	    int max = maxNum(array);
	    

	    System.out.println(max);
		}
	   public static int maxNum (int[]array) {
		   int max = array[0];
		   for(int i = 0;i<array.length;i++) {
			   if(array[i]>max) {
				   max = array[i];
			   }
		   }
	   
	   return max;
	   } 
     
	   
}






/* public static void main(String[] args) {
 	// #1
    int[] array = new int[] {356,6,9,12,15,45};
    int max = maxNum(array);
    

    System.out.println(max);
	}
   public static int maxNum (int[]array) {
	  int max = array[0];
	   for(int i = 0;i<array.length;i++) {
		   if(array[i]>=max) {
			   max = array[i];
		   }
	   }
   
   return max;
   } 
 
 
 // #2
	public static void main(String[] args) {
		int height = 5;
		int width = 8;
     drawRectangle(height,width);
	}
   public static void drawRectangle (int height,int width) {
	   
	   for (int i = 0; i < height; i++) {
           for (int j = 0; j < width; j++) {
        	   System.out.print("*");

           }
           System.out.println();

       }
	   
	   
   } 
 
 
 
 
 	
 
 // #3
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,4,6,7,8,10,12};
		int num = getNum();
        int index = searchNum(array,num);
        if(index == -1) {
        	System.out.println("There is no such number in the array");
        }else {
        	System.out.println("Entered number at index : " + index);
        }
   
      
	}
	 static public int getNum () {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to search: ");
	        int  num = sc.nextInt();
	        return num;
	 } 
	 static int searchNum(int[] array,int num) {
	        int index = -1;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == num) {
	                index = i;
	            }
	        }
	        return index;
	    }
     
 
 
 
 
 
 
 
 
 
 
 
 
 */
