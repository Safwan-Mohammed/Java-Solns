class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor with all dimensions provided
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Parameterized constructor with default depth (assuming a cube)
    public Box(double side) {
        this.width = side;
        this.height = side;
        this.depth = side;
    }

    public void calculateVolume() {
        double volume = width * height * depth;
        System.out.println("Volume of the Box: " + volume);
    }
}

public class Two_b {
    public static void main(String[] args) {
        // Cuboid
        Box box1 = new Box(5, 3, 4);
        box1.calculateVolume();

        //Cube
        Box box2 = new Box(7);
        box2.calculateVolume();
    }
}
