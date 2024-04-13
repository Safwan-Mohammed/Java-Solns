import java.util.Scanner;

public class Five_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            int result = num1 / num2; // Potential ArithmeticException here
            
            int[] arr = new int[5];
            for(int i = 0 ; i < 5; i++){
                arr[i] = i+1;
            }
            System.out.println("Enter an index to retrieve a value from the array: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]); // Potential ArrayIndexOutOfBoundsException here
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
