import java.util.Scanner;

class Parent{
    int a, b;

    public void setSides(int a){
        this.a = a;
        this.b = a;
    }

    public void setSides(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void displayMessage(){
        System.out.println("Dummy Message");
    }
}

class Child extends Parent{
    public void displayMessage(){
        int area = this.a * this.b;
        System.out.println("Area : "+area);
    }
}

public class Three_a {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("Enter your Choice , 1 for Square, 2 for Rectangle");
        choice = sc.nextInt();

        Child c = new Child();

        switch(choice){
            case 1: 
                    System.out.println("Enter the sides of Square");
                    int a = sc.nextInt();
                    c.setSides(a);
                    break;
            
            case 2: 
                    System.out.println("Enter the sides of rectangle");
                    int b = sc.nextInt();
                    int l = sc.nextInt();
                    c.setSides(l, b);
                    break;
            
            default: System.out.println("Invalid Input");
                     return;

        }

        c.displayMessage();
    }
}
