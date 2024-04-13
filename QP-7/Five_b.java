import java.util.Scanner;

public class Five_b {

    public static double avgFirstN(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("N should be a positive non-zero integer.");
        }

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return (double) sum / N;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        try {
            double average = avgFirstN(n);
            System.out.println("Average of first " + n + " numbers: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
