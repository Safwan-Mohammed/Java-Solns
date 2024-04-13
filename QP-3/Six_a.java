public class Six_a {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.setName("PANDEMIC");
        System.out.println("Thread Name: " + thread.getName());
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Bye Bye");
    }
}
