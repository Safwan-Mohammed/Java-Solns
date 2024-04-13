class PrintThread extends Thread {
    private String message;
    private int times;

    public PrintThread(String message, int times) {
        this.message = message;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Six_a {
    public static void main(String[] args) {
        PrintThread csThread = new PrintThread("CS", 5);
        PrintThread isThread = new PrintThread("IS", 5);

        csThread.start(); 
        isThread.start(); 
    }
}
