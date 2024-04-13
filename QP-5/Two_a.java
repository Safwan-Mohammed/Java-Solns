//Static Variable

class Counter {
    static int count = 0; 

    Counter() {
        count++; // Increment count each time a new object is created
    }

    static void displayCount() { 
        System.out.println("Count: " + count);
    }
}

public class Two_a {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount(); 
    }
}


//Static Method

class MathUtils {
    static int add(int a, int b) { 
        return a + b;
    }
}

public class Two_a {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 10); // Call static method directly using class name
        System.out.println("Sum: " + sum);
    }
}
