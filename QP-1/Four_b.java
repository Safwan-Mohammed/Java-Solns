import java.util.Scanner;

public class Four_b {

    // Using try-catch
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, denom;
        System.out.println("Enter the numerator and denominator: \n");
        num = sc.nextInt();
        denom = sc.nextInt();
        try{
            double result = num/denom;
            System.out.println("Division Result: "+result);
        } catch(ArithmeticException e){
            System.out.println("Division Exception: "+e);
        }
    }    

    //Using throws keyword
    // public static void main(String[] args) throws ArithmeticException{
    //     Scanner sc = new Scanner(System.in);
    //     int num, denom;
    //     System.out.println("Enter the numerator and denominator: \n");
    //     num = sc.nextInt();
    //     denom = sc.nextInt();
    //     double result = num/denom;
    //     System.out.println("Division Result: "+result);
    // } 
}
