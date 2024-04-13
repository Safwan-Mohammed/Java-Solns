class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class Six_b {
    public static void main(String[] args) {
        MyThread threadA = new MyThread("Thread A");
        MyThread threadB = new MyThread("Thread B");
        MyThread threadC = new MyThread("Thread C");

        // Set priorities
        threadA.setPriority(Thread.MIN_PRIORITY); 
        threadB.setPriority(Thread.MAX_PRIORITY); 
        threadC.setPriority(Thread.currentThread().getPriority() + 1); 

        // Start threads
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
