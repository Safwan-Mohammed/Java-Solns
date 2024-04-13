// User-defined exception Reorder
class Reorder extends Exception {
    public Reorder(String message) {
        super(message);
    }
}


class Item {
    int id;
    String name;
    double price;
    int quantity;
    int reorderLevel;

    public Item(int id, String name, double price, int quantity, int reorderLevel) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }

    public void purchase(int quantityToAdd) {
        quantity += quantityToAdd;
    }

    public void sell(int quantityToSell) throws Reorder {
        quantity -= quantityToSell;
        if (quantity < reorderLevel) {
            throw new Reorder("Reorder required for item: " + name);
        }
    }

    public void displayDetails() {
        System.out.println("Item ID: " + id);
        System.out.println("Item Name: " + name);
        System.out.println("Item Price: $" + price);
        System.out.println("Item Quantity: " + quantity);
        System.out.println("Reorder Level: " + reorderLevel);
    }
}

public class Four_c {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Laptop", 1000.0, 10, 5);
        Item item2 = new Item(2, "Smartphone", 500.0, 20, 10);

        try {
            // Sell some quantities to trigger reorder exception
            item1.sell(8);
            item2.sell(18);
        } catch (Reorder e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("--- Item Details ---");
        System.out.println("Item 1:");
        item1.displayDetails();
        System.out.println("\nItem 2:");
        item2.displayDetails();
    }
}
