class Fuel {
    String fuelType;
    int quantity;

    public Fuel(String fuelType, int quantity) {
        this.fuelType = fuelType;
        this.quantity = quantity;
    }

    public void check_Fuel(String newFuelType, int newQuantity) throws Exception {
        if (newFuelType.equalsIgnoreCase("Petrol")) {
            throw new Exception("Cannot add Petrol to Fuel");
        } else if (quantity + newQuantity > 50) {
            throw new Exception("Quantity exceeds maximum limit of 50");
        } else {
            fuelType = newFuelType;
            quantity += newQuantity;
            System.out.println("Updated Fuel Info:");
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Quantity: " + quantity);
        }
    }
}

public class Four_c {
    public static void main(String[] args) {
        Fuel fuel = new Fuel("Diesel", 20); 

        try {
            fuel.check_Fuel("Diesel", 10); 
            fuel.check_Fuel("Petrol", 5); // Try to add Petrol (Exception)
            fuel.check_Fuel("Diesel", 30); // Try to add 30 units of Diesel (Exception)
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
