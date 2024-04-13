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

public class Three_a {
    public static void main(String[] args){
        Child C = new Child();
        C.printAge();
    }    
}
