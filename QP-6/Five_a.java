public class Five_a {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 0, 20 };
        try {
            // Outer try block
            for (int i = 0; i < 5; i++) {
                try {
                    // Inner try block
                    int result = numbers[i] / numbers[i + 1];
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
