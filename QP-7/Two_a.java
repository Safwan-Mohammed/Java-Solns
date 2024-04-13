
interface StackInterface {
    public void push(int item);  
    public void pop();  
}

public class Two_a implements StackInterface {

    private int[] stackArray;
    private int top; 
    private int capacity;

    public Two_a(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element onto a full stack.");
            return;
        }
        stackArray[++top] = item;
        System.out.println("Pushed element: " + item);
    }

    @Override
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        int poppedItem = stackArray[top--];
        System.out.println("Popped element: " + poppedItem);
    }

    public static void main(String[] args) {
        Two_a stack = new Two_a(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Attempt to push onto a full stack
        stack.push(60);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // Attempt to pop from an empty stack
        stack.pop();
    }
    
}
