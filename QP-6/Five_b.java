interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void stop(); 
}

interface ElectricCar extends Car {
    void charge(); 
}

class Tesla implements ElectricCar {
    @Override
    public void start() {
        System.out.println("Tesla started");
    }

    @Override
    public void stop() {
        System.out.println("Tesla stopped");
    }

    @Override
    public void charge() {
        System.out.println("Tesla charging");
    }
}

public class Five_b {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.stop();
        tesla.charge();
    }
}
