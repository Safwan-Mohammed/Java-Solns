abstract class Vehicle {
    abstract int numberOfTyres();
    void steering() {
        System.out.println("Vehicle steering");
    }
}


class Lorry extends Vehicle {
    @Override
    int numberOfTyres() {
        return 6;
    }
}

class Car extends Vehicle {
    @Override
    int numberOfTyres() {
        return 4;
    }
}

class Cycle extends Vehicle {
    @Override
    int numberOfTyres() {
        return 2;
    }
}

public class Three_c {
    public static void main(String[] args) {
        Vehicle lorry = new Lorry();
        Vehicle car = new Car();
        Vehicle cycle = new Cycle();


        System.out.println("Lorry has " + lorry.numberOfTyres() + " tyres");
        lorry.steering();

        System.out.println("Car has " + car.numberOfTyres() + " tyres");
        car.steering();

        System.out.println("Cycle has " + cycle.numberOfTyres() + " tyres");
        cycle.steering();
    }
}
