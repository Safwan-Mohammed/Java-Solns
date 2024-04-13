public class One_b {
    public static void main(String[] args) {
        
        int numInt = 100;
        long numLong = numInt; 
        float numFloat = numLong; 
        double numDouble = numFloat; 

        System.out.println("After Type Conversion:");
        System.out.println("Int to Long: " + numLong);
        System.out.println("Long to Float: " + numFloat);
        System.out.println("Float to Double: " + numDouble);

        double bigNumDouble = 12345.678;
        float bigNumFloat = (float) bigNumDouble; 
        long bigNumLong = (long) bigNumFloat; 
        int bigNumInt = (int) bigNumLong; 

        System.out.println("\nAfter Casting:");
        System.out.println("Double to Float: " + bigNumFloat);
        System.out.println("Float to Long: " + bigNumLong);
        System.out.println("Long to Int: " + bigNumInt);
    }
}
