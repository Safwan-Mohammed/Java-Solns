
class NumberOfArgumentException extends Exception {
    public NumberOfArgumentException(String message) {
        super(message);
    }
}

public class Four_b {
    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                throw new NumberOfArgumentException("Insufficient arguments! Please provide 3 numbers.");
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            int result = num1 * num2 * num3;
            System.out.println("Multiplication result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please provide valid integer arguments.");
        } catch (NumberOfArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
