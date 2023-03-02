package multithreadarray;

public class Main {

	public static void main(String[] args) {
        int[] arr = new int[200000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        MultiThreadSum one = new MultiThreadSum(arr, 0, 50000000);
        MultiThreadSum two = new MultiThreadSum(arr, 50000000, 100000000);
        MultiThreadSum three = new MultiThreadSum(arr, 100000000, 150000000);
        MultiThreadSum four = new MultiThreadSum(arr, 150000000, 200000000);

        Thread th1 = new Thread(one);
        Thread th2 = new Thread(two);
        Thread th3 = new Thread(three);
        Thread th4 = new Thread(four);

        long startTime = System.nanoTime();

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long totalSum = one.getSum() + two.getSum() + three.getSum() + four.getSum();
        System.out.println("Total = " + totalSum);

        long endTime = System.nanoTime();
        System.out.println("Time of multithreading calculating: " + (endTime-startTime) + " ns");

        long startTime1 = System.nanoTime();
        MultiThreadSum five = new MultiThreadSum();
        System.out.println("Total = " + five.calculateSum(arr,0,200000000));

        long endTime1 = System.nanoTime();
        System.out.println("Time of one threading calculating: " + (endTime1-startTime1) + " ns");
    }

}
