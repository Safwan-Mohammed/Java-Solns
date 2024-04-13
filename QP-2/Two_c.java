class Animal {
    String color = "White";

    void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    String color = "Black";

    void display() {
        super.display(); // Calls the display method of the superclass
        System.out.println("I am a dog");
    }

    void printColors() {
        System.out.println("Superclass color: " + super.color); // Access superclass field
        System.out.println("Subclass color: " + color); // Access subclass field
    }
}

public class Two_c {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
        myDog.printColors();
    }
}
