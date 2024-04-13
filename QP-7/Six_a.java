class MyThread extends Thread {
    String word;
    int order;
    static int currentOrder = 1;
    static final Object lock = new Object();

    MyThread(String word, int order) {
        this.word = word;
        this.order = order;
    }

    public void run() {
        synchronized (lock) {
            while (order != currentOrder) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            System.out.println(word);
            currentOrder++;
            lock.notifyAll();
        }
    }
}

public class Six_a {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("[BMS]", 1);
        MyThread thread2 = new MyThread("[College]", 2);
        MyThread thread3 = new MyThread("[of]", 3);
        MyThread thread4 = new MyThread("[Engineering]", 4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
