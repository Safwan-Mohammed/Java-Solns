import java.util.Scanner;

class MyClass {
    int intValue;
    double doubleValue;
    String stringValue;
    boolean boolValue;

    public MyClass(int intValue, double doubleValue, String stringValue, boolean boolValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
        this.boolValue = boolValue;
    }

    public void displayValues() {
        System.out.println("Int Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("String Value: " + stringValue);
        System.out.println("Boolean Value: " + boolValue);
    }
}

public class Two_b {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer double string and boolean value respectively");

        MyClass obj = new MyClass(sc.nextInt(), sc.nextDouble(), sc.next(), sc.nextBoolean());
        obj.displayValues();
    }
}
