//Final Keyword on Variable

public class Three_c {
    public static void main(String[] args) {
        final int num = 10; // Final variable

        // num = 20; // Error: Cannot assign a value to final variable 'num'
        System.out.println("Final Variable: " + num);
    }
}


//Final method cannot be overridden when inherited, 

class Parent {
    final void display() {
        System.out.println("This is a final method in Parent class.");
    }
}

class Child extends Parent {
    // Trying to override final method will result in a compile-time error
    // void display() { // Error: Cannot override the final method from Parent
    //     System.out.println("This method cannot be overridden.");
    // }
}

public class Three_c {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();
    }
}



//Dynamic Method Dispatch

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

public class Three_c {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Reference of Animal, object of Dog
        Animal animal2 = new Cat(); // Reference of Animal, object of Cat

        animal1.sound(); // Calls Dog's sound method
        animal2.sound(); // Calls Cat's sound method
    }
}
