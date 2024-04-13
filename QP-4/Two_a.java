import java.lang.Integer;
public class Two_a {
    public static void main(String[] args){
        if (args.length != 2) {
            System.out.println("Invalid Input");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
