import java.lang.Double;

public class Two_c {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid Inputs");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        double result = num1 * num2 * num3;
        System.out.println("Product : "+ result);
    }
}
