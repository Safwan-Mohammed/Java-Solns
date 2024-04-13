class MyThread implements Runnable {
    
    Thread thread;
    MyThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        try {
            for (int count = 5; count > 0; count--) {
                System.out.println(thread.getName() + ": " + count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " exiting.");
    }
}

public class Seven_b {
    public static void main(String args[]) {
        MyThread mt1 = new MyThread("Child Thread 1");
        MyThread mt2 = new MyThread("Child Thread 2");
        MyThread mt3 = new MyThread("Child Thread 3");

        try {
            System.out.println("Waiting for threads to finish.");
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread 1 alive: " + mt1.thread.isAlive());
        System.out.println("Thread 2 alive: " + mt2.thread.isAlive());
        System.out.println("Thread 3 alive: " + mt3.thread.isAlive());

        System.out.println("Main thread exiting.");
    }
}
