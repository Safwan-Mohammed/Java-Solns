class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Three_a {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Reference of Animal, object of Dog
        Animal animal2 = new Cat(); // Reference of Animal, object of Cat

        animal1.sound(); // Calls Dog's sound method
        animal2.sound(); // Calls Cat's sound method
    }
}
