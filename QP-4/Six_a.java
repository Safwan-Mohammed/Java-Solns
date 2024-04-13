import java.util.Random;

class RandomNumber implements Runnable {
    private volatile boolean running;
    private Thread thread;
    private Random random;
    
    public RandomNumber() {
        running = true;
        random = new Random();
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000); 
                int num = random.nextInt(100); // Generate random number between 0 to 99
                System.out.println("Generated Number: " + num);
                if (num % 2 == 0) {
                    new SquareThread(num);
                } else {
                    new CubeThread(num);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        running = false;
        thread.interrupt();
    }
}

class SquareThread implements Runnable {
    private int num;
    private Thread thread;

    public SquareThread(int num) {
        this.num = num;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int square = num * num;
        System.out.println("Square of " + num + ": " + square);
    }
}

class CubeThread implements Runnable {
    private int num;
    private Thread thread;

    public CubeThread(int num) {
        this.num = num;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int cube = num * num * num;
        System.out.println("Cube of " + num + ": " + cube);
    }
}

public class Six_a {
    public static void main(String[] args) {
        RandomNumber generator = new RandomNumber();
        
        // Wait for 10 seconds before stopping the generator thread
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        generator.stop(); 
    }
}
