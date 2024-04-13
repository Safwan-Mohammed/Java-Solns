import java.util.Scanner;

interface Add{
    public int add();
}

interface Sub{
    public int sub();
}

class A1 implements Add, Sub{
    int a, b;
    
    A1(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return this.a + this.b;
    }

    public int sub(){
        return this.a - this.b;
    }
}

public class Four_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        A1 obj = new A1(a, b);

        System.out.println("Addition: "+obj.add());
        System.out.println("Subtraction: "+obj.sub());

    }
}
