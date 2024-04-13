class Car_Service {
    private boolean isMechanicAvailable;

    public Car_Service() {
        isMechanicAvailable = false;
    }

    public synchronized void put() {
        if (!isMechanicAvailable) {
            System.out.println("Car owner requests car service.");
            isMechanicAvailable = true;
            notify(); 
        } else {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public synchronized void get() {
        if (isMechanicAvailable) {
            System.out.println("Mechanic starts servicing the car.");
            isMechanicAvailable = false;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Car_Owner extends Thread {
    private Car_Service carService;

    public Car_Owner(Car_Service carService) {
        this.carService = carService;
    }

    public void run() {
        carService.put();
    }
}

class Car_Mechanic extends Thread {
    private Car_Service carService;

    public Car_Mechanic(Car_Service carService) {
        this.carService = carService;
    }

    public void run() {
        carService.get();
    }
}

public class Seven_c {
    public static void main(String[] args) {
        Car_Service carService = new Car_Service();
        Car_Owner carOwner = new Car_Owner(carService);
        Car_Mechanic carMechanic = new Car_Mechanic(carService);

        // Start owner and mechanic threads
        carOwner.start();
        carMechanic.start();
    }
}
