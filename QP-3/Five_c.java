interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }

    void displayStatus() {
        System.out.println("Bicycle Status:");
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + speed);
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void displayStatus() {
        System.out.println("Bike Status:");
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + speed);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Create objects of Bicycle and Bike classes
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();

        // Test the implemented interface methods
        bicycle.changeGear(1);
        bicycle.speedUp(10);
        bicycle.applyBrakes(5);
        bicycle.displayStatus();

        System.out.println();

        bike.changeGear(3);
        bike.speedUp(20);
        bike.applyBrakes(8);
        bike.displayStatus();
    }
}
