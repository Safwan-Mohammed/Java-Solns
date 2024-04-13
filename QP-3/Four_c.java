interface Polygon {
    void getArea();
    void getSides();
}

class Triangle implements Polygon {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void getArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of the Triangle: " + area);
    }

    @Override
    public void getSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = length * width;
        System.out.println("Area of the Rectangle: " + area);
    }

    @Override
    public void getSides() {
        System.out.println("Rectangle has 4 sides.");
    }
}

public class Four_c {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 8);
        Rectangle rectangle = new Rectangle(10, 6);

        System.out.println("Triangle Details:");
        triangle.getArea();
        triangle.getSides();

        System.out.println("\nRectangle Details:");
        rectangle.getArea();
        rectangle.getSides();
    }
}
