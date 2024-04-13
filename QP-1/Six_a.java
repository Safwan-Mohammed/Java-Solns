//Method 1 , by extending Thread Class

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class Six_a {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
    }
}

// Method 2 , by implementing Runnable interface

// class MyRunnable implements Runnable {
//     public void run() {
//         System.out.println("Thread running: " + Thread.currentThread().getName());
//     }
// }

// public class Six_a {
//     public static void main(String[] args) {
//         MyRunnable myRunnable = new MyRunnable();
//         Thread thread2 = new Thread(myRunnable);
//         thread2.start();
//     }
// }