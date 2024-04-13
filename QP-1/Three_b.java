import java.util.Scanner;

//method overloading
class A{

    public double area(int side){
        double product;
        product = side*side;
        return product;
    }

    public double area(int length, int breadth){
        double product;
        product = length * breadth;
        return product;
    }
}

class B{
    public void print(){
        System.out.println("I'm method of Parent Class B");
    }
}

class C extends B{
    public void print(){
        System.out.println("I'm overrided method of Child Class C");
    }
}

public class Three_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int a = sc.nextInt();
        System.out.println("Enter the sides of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        A obj1 = new A();
        System.out.println("Area of Square: "+obj1.area(a));
        System.out.println("Area of Rectangle: "+obj1.area(l, b));
        B obj2 = new B();
        C obj3 = new C();
        obj2.print();
        obj3.print();
    }
}
