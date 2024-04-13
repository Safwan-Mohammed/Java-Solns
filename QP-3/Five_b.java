class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Five_b {
    public static double mySqrt(double num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Square root of negative number not possible.");
        }
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number to compute its square root: ");
            double number = scanner.nextDouble();
            scanner.close();

            double result = mySqrt(number);
            System.out.println("Square root of " + number + " is: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}