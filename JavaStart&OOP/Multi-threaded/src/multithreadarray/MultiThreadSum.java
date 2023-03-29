package multithreadarray;

public class MultiThreadSum implements Runnable {
	private int[] arr;
    private int start;
    private int end;
    private long sum;

    public MultiThreadSum() {
    }

    public MultiThreadSum(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public long calculateSum(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th.getName() + ", sum of thread=" + calculateSum(this.arr, this.start, this.end));
    }
}
