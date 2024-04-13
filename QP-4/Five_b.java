interface Shape {
    void draw(); 
}

interface Color {
    void setColor(String color); 
}

//Multiple Inheritance is achieved by using interfaces

class Circle implements Shape, Color {
    private String color; 

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Circle Color: " + color);
    }
}

public class Five_b {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw(); 
        circle.setColor("Red");
        circle.displayColor();
    }
}
