import java.lang.Double;

public class Five_a {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Usage: java DivideNumbers <num1> <num2>");
            }

            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            double result = num1 / num2;
            System.out.println("Result of " + num1 + " / " + num2 + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

