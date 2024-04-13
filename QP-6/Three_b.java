//Final Keyword on Variable

public class Three_b {
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

public class Three_b {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();
    }
}


//Next Program


// Super Keyword

class Parent{
    int age = 40;
}

class Child extends Parent{
    int age = 20;

    public void printAge(){
        System.out.println("Parent Age: " + super.age);
        System.out.println("Child Age: " + this.age);
    }
}

public class Three_b {
    public static void main(String[] args){
        Child C = new Child();
        C.printAge();
    }    
}
