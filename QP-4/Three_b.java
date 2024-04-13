import java.util.Scanner;

abstract class Shape {
    abstract void displayArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void displayArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void displayArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Three_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of square: ");
        Shape square = new Square(sc.nextInt());

        System.out.println("Enter sides of rectangle: ");
        Shape rectangle = new Rectangle(sc.nextInt(), sc.nextInt());

        System.out.println("Enter radius of circle: ");
        Shape circle = new Circle(sc.nextInt());
        
        square.displayArea();
        rectangle.displayArea();
        circle.displayArea();
    }
}
