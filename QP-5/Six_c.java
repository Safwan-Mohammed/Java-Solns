class OddSumThread extends Thread {
    private long oddSum;

    @Override
    public void run() {
        oddSum = 0;
        for (int i = 1; i <= 100; i += 2) {
            oddSum += i;
        }
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);
    }

    public long getOddSum() {
        return oddSum;
    }
}

public class Six_c {
    public static void main(String[] args) {
        OddSumThread oddThread = new OddSumThread();
        oddThread.start(); 

        long evenSum = 0;
        for (int i = 2; i <= 100; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);

        // Wait for the oddSum thread to complete and get the result
        try {
            oddThread.join();
            long oddSum = oddThread.getOddSum();
            System.out.println("Sum of odd numbers from 1 to 100 (from thread): " + oddSum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
