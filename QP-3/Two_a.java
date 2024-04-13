import java.util.Scanner;
import java.lang.Math;

class Circle{
    double radius = 1.0;
    String color = "red";

    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double calcArea(){
        return Math.PI * this.radius * this.radius;
    }
}

public class Two_a {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println("Area of Circle 1: "+c1.calcArea());
        System.out.println("Area of Circle 2: "+c2.calcArea());
    }
}
