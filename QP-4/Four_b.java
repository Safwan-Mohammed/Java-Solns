import java.lang.Integer;

public class Four_b {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect Input");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);

            if (num < 10 || num > 50) {
                throw new Exception("Number out of range (10 to 50)");
            } else {
                int square = num * num;
                System.out.println("Square of " + num + " is: " + square);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }    
}
